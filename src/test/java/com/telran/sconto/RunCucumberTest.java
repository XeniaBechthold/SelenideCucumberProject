package com.telran.sconto;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:build/cucumber-report/cucumber.json", "pretty"},
        features = "src/test/resources/features", tags = "  @emptyPassword")

public class RunCucumberTest {
}
