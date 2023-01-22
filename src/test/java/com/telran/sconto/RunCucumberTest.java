package com.telran.sconto;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:build/cucumber-report/cucumber.json", "pretty"},
        features = "src/test/resources/features", tags = "@invalidEmail")


@io.cucumber.testng.CucumberOptions(plugin = {"json:build/cucumber-report/cucumber.json", "pretty"},
        features = "src/test/resources/features", tags = "@invalidEmail")
public class RunCucumberTest extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
