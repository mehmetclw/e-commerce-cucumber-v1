package com.ecommerce.stepdefinitions;

import com.ecommerce.utility.Driver;
import com.ecommerce.utility.library.AppLibrary;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.time.Duration;

public class Hook {

    @Before
    public void setup(Scenario scenario){
        System.out.println("Starting scenario: " + scenario.getName());
        System.out.println("Tags: " + scenario.getSourceTagNames());
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("Ending scenario: " + scenario.getName());
        Driver.close();
    }
}
