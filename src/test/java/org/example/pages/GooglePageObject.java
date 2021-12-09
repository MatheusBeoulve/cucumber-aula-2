package org.example.pages;

import org.example.core.WebDriverProvider;

public class GooglePageObject extends PageObject {

    public GooglePageObject(WebDriverProvider webDriverProvider) {
        super(webDriverProvider);
    }

    public GooglePageObject acessarGoogle() {

        getWebDriver().get("https://google.com");

        return this;
    }
}
