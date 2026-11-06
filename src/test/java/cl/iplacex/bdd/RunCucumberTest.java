package cl.iplacex.bdd;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(
    key = "cucumber.glue",
    value = "cl.iplacex.bdd"
)
@ConfigurationParameter(
    key = "cucumber.plugin",
    value = "pretty, html:target/cucumber-reports/cucumber.html"
)
public class RunCucumberTest {
    
}
