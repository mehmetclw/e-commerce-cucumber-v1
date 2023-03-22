package com.ecommerce.utility.library;

public class AppLibrary {
    private PageLibrary page;
    private FlowsLibrary flowsLibrary;

    public AppLibrary() {
        page = new PageLibrary();
        flowsLibrary = new FlowsLibrary();
    }

    public PageLibrary getPage() {
        return page;
    }

    public FlowsLibrary getFlowsLibrary() {
        return flowsLibrary;
    }
}
