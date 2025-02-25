package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions"},
        plugin = { "pretty", "html:target/cucumber-reports.html", "json: test-reports/json-report.json" },
        tags = "@SmokeTest",
        monochrome = true
)
public class Activity6 {
}
