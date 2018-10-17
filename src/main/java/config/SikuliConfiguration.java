package config;

import helpers.ConfigManager;
import org.apache.commons.configuration.ConfigurationException;
import org.sikuli.basics.Settings;
import org.sikuli.script.ImagePath;
import org.sikuli.script.RunTime;

import java.io.File;

public class SikuliConfiguration {

    public static void setSikuliSettings() throws ConfigurationException  {
        Settings.AutoWaitTimeout = Float.valueOf(ConfigManager.getConfig("sikuli.timeout"));
        ImagePath.setBundlePath(new File(RunTime.get().fSxProject, "target/test-classes/patterns/").getAbsolutePath());
    }
}
