package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

new*

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        glue = "cucumber.stepDef",
        plugin = {"html:target/HTML_report.html"}
)

public class RunFilter {
}
