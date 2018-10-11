package step.definitions;

import cucumber.api.java.en.Given;
import org.sikuli.script.Screen;
import org.springframework.beans.factory.annotation.Autowired;

public class DesktopSteps extends AbstractSteps{

    @Autowired
    private Screen screen;

    @Given("^I click on the lync icon$")
    public void I_am_a_test() throws Throwable {
        screen.click("lyncimage.png", 10);
    }
}
