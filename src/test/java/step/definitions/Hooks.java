package step.definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import helpers.ConfigManager;
import org.apache.commons.configuration.ConfigurationException;
import org.sikuli.script.Screen;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Hooks {

    Logger logger = Logger.getLogger(Hooks.class.getName());

    @After
    public void takeScreenshotIfFailed(Scenario scenario) throws ConfigurationException {
        if (scenario.isFailed()) {
            Screen screen = new Screen();
            String filename = scenario.getName() + ".png";
            Path filepath = Paths.get(ConfigManager.getConfig("screenshot.location"), filename);
            try {
                ImageIO.write(screen.capture().getImage(), "png", filepath.toFile());
                logger.log(Level.INFO, "Screenshot written for failed scenario to: "+filepath);
            } catch (IOException e) {
                logger.log(Level.WARNING, "IOException when trying to write to file: "+filepath);
                logger.log(Level.WARNING, e.getMessage());
            }
        }
    }

}
