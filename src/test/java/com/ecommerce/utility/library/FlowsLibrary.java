package com.ecommerce.utility.library;

import com.ecommerce.utility.Driver;

public class FlowsLibrary {

    public void navigateToUrl(String url){
        Driver.getDriver().get(url);
    }

    public String getCurrentPageTitle(){
       return Driver.getDriver().getTitle();
    }

    public String getCurrentPageUrl(){
        return Driver.getDriver().getCurrentUrl();
    }
}
