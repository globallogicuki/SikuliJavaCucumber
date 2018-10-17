package step.definitions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "step.definitions",
        plugin = {"pretty", "json:target/reports/test-result.json", "html:target/reports/test-results.html"}
)
public class TestRunner {
}

