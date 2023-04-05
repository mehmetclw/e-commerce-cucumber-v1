package com.ecommerce.stepdefinitions;

import com.ecommerce.utility.Driver;
import com.ecommerce.utility.library.AppLibrary;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.time.Duration;

public class Hook {
    private static final Logger logger = LogManager.getLogger(Hook.class);

    @Before
    public void setup(Scenario scenario) {
        logger.info("Starting scenario: " + scenario.getName());
        logger.info("Tags: " + scenario.getSourceTagNames());
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            logger.error("Test Failed : " + scenario.getName());
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/jpeg", "Failed Test Screenshot:");
        } else {
            logger.info("Clean Up stated");
        }
        logger.info("Ending scenario: " + scenario.getName());
        Driver.close();
    }

}
