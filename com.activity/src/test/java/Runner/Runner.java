package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/feature"
,glue= {"src/test/java/Stepdefinition"}
,plugin = { "pretty", "html:target/cucumber-reports.html","json:target/cucumber.json" },
monochrome = true
)

public class Runner {



}
