package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression or @SmokeTest",  //hangi senaryolarda bu etiket varsa onları çalıştırır
        // or yerine and yazılırsa hem smoke hem de regression tag i olanları çalıştırıyor(2 etiketli olanları)
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
