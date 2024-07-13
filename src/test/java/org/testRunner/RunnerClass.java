package org.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\resources\\Features", glue = "org.loginDemo", monochrome = true, dryRun = false, plugin = "html:C:\\Users\\dines\\eclipse-workspace\\Selenium\\target")

public class RunnerClass {

}
