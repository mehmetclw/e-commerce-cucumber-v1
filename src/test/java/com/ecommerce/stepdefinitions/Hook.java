package com.ecommerce.stepdefinitions;

import com.ecommerce.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import java.time.Duration;

public class Hook {
    @Before
    public void setup(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown(){
        Driver.close();
    }
}
