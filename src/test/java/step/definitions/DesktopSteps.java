package step.definitions;

import config.SikuliConfiguration;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

import java.util.logging.Logger;

public class DesktopSteps {

    private Screen screen;
    Logger logger = Logger.getLogger(Hooks.class.getName());


    @Before
    public void setConfig() throws Exception {
        screen = new Screen();
        SikuliConfiguration.setSikuliSettings();
    }

    @Given("^I click on the lync icon$")
    public void I_am_a_test() throws Throwable {
        screen.click("lyncimage.png", 10);
    }

    @Given("^The mouse moves to the corners of the screen$")
    public void click_system_preferences() throws FindFailed {
        Region topLeft = new Region(0,0);
        Region topRight = new Region(screen.w-1,0);
        Region bottomLeft = new Region(0,screen.h-1);
        Region bottomRight = new Region(screen.w-1,screen.h-1);
        Region middle = new Region(screen.w/2,screen.h/2);

        logger.info("Moving to top left");
        screen.mouseMove(topLeft);
        logger.info("Moving to top right");
        screen.mouseMove(topRight);
        logger.info("Moving to bottom left");
        screen.mouseMove(bottomLeft);
        logger.info("Moving to bottom right");
        screen.mouseMove(bottomRight);
        logger.info("Moving to middle");
        screen.mouseMove(middle);
    }

    @Given("^I go crazy with the mouse$")
    public void crazyMouse() throws FindFailed {
        for(int idx=0; idx < 10; ++idx){
            double x = (int)(Math.random()*((screen.w)+1));
            double y = (int)(Math.random()*((screen.h)+1));
            Region nextPlace = new Region((int)x,(int)y);
            screen.mouseMove(nextPlace);
        }
    }
}
