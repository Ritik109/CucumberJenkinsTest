package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"Gherkins"},
       plugin =  { "json:target/cucumber.json"},

        glue = {"stepdef"},
        strict = true,
        dryRun = true,
        monochrome = true
)
public class TestRunner {
}
