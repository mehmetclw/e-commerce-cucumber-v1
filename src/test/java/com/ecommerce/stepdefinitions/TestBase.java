package com.ecommerce.stepdefinitions;

import com.ecommerce.utility.library.AppLibrary;

public class TestBase {
    private AppLibrary appLibrary;

    public TestBase() {
        appLibrary = new AppLibrary();
    }
    public AppLibrary getAppLibrary() {
        return appLibrary;
    }

}
