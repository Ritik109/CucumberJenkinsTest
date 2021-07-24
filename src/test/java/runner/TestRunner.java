package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"Gherkins"},
       plugin =  { "pretty","html:target/cucumber-html-report","json:target/Cucumber.json"},

        glue = {"stepdef"},
        strict = true,
        dryRun = true,
        monochrome = true
)
public class TestRunner {
}
