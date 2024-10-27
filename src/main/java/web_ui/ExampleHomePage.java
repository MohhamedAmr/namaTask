package web_ui;

import org.openqa.selenium.*;
import utils.wait.ExplicitDriverWait;

public class ExampleHomePage extends WebPageBase {
    public ExampleHomePage(WebDriver webDriver) {
        super(webDriver);
    }

    private final By moreInfoLink = By.xpath("//a[text()='More information...']");


    public void clickMoreInfoLink() {
        new ExplicitDriverWait(webDriver).waitUntilElementAppear(10, moreInfoLink);
        webDriver.findElement(moreInfoLink).click();
    }



}
