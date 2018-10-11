package config;

import helpers.ConfigManager;
import org.sikuli.basics.Settings;
import org.sikuli.script.IScreen;
import org.sikuli.script.ImagePath;
import org.sikuli.script.RunTime;
import org.sikuli.script.Screen;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.io.File;

public class SikuliConfiguration {

    @Bean
    public IScreen screen() {
        return new Screen();
    }

    @PostConstruct
    public void setSikuliSettings() throws Exception {
        Settings.AutoWaitTimeout = Float.valueOf(ConfigManager.getConfig("sikuli.timeout"));
        ImagePath.setBundlePath(new File(RunTime.get().fSxProject, "target/test-classes/patterns/").getAbsolutePath());
    }
}
