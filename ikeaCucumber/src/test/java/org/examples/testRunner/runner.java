package org.examples.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = "org.examples.stepDefs",
tags = "@Happy",
        plugin = {
                "pretty",
                "html:reports/report.html"
        }

)
public class runner extends AbstractTestNGCucumberTests{ }
