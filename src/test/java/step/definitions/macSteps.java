package step.definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

import java.util.logging.Logger;

public class macSteps {
    private Screen screen = new Screen();
    Logger logger = Logger.getLogger(Hooks.class.getName());


    @Given("^I have opened the launchpad$")
    public void iHaveOpenedSpotlightSearch() throws FindFailed {
        logger.info("Moving mouse to bottom of screen to try and bring up the quicklaunch bar");
        screen.mouseMove(new Region(screen.w/2, screen.h-10));
        screen.click("launchPad.png");
    }

    @And("^I click calculator button (\\d+)$")
    public void iClickCalculatorButton(int arg0) throws FindFailed{

    }
}
