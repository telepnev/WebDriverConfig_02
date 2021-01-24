package io.telepnev;

import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {

    @DefaultValue("CHROME")
    @Key("webdriver.browser.name")
    BrowserName browserName();
}
