package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\pagad\\eclipse-workspace\\cucumber_project\\Features\\Login.feature",
            glue="stepdefinition",
            dryRun=false)

public class TestRunner {
}
//C:\Users\pagad\eclipse-workspace\cucumber_project\Features\Login.feature
//C:\Users\pagad\eclipse-workspace\cucumber_project\Features\Login.feature