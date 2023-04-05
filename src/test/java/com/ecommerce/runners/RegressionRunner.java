package com.ecommerce.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
      /*  features = {"src/test/resources/features/shoppingcart/PaymentFunctionality.feature",
                "src/test/resources/features/homepage/LoginFunctionality.feature"},*/
        features = "src/test/resources/features",
        glue = "com/ecommerce/stepdefinitions",
        dryRun = false,
        tags = "@regression",
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)

public class RegressionRunner {
}
