package runTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty", "html:reports/reports"},
        features = {"./src/test/resources/features"},
        glue = {"br.com.yourLogo.web.steps", "br.com.yourLogo.web.configuration"},
        tags = "@Smoke_test")

public class RunTest {
}
