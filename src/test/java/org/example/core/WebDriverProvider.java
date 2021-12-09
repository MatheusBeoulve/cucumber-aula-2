package org.example.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;

public class WebDriverProvider {

    private WebDriver webDriver;

    public void start() {
        System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, System.getenv("EDGE_DRIVER"));
        webDriver = new EdgeDriver();
    }

    public void close() {
        webDriver.quit();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
