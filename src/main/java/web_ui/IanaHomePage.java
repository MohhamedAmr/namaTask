package web_ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IanaHomePage extends WebPageBase {

    private final By termsOfService = By.xpath("//a[text()='Terms of Service']");


    public IanaHomePage(WebDriver webDriver) {
        super(webDriver);
    }
    public WebElement getTermsOfServiceElement() {
        return webDriver.findElement(termsOfService);
    }
}
