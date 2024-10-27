package test_runner;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.WebTestBase;
import web_ui.ExampleHomePage;

public class ExampleHomeTest extends WebTestBase {
    ExampleHomePage exampleHomePage;


    @Description("This test attempts to Search with keyword and combining filters such as price and brand")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)
    public void assertOnPageTitle() {
        String expectedTitle = "Example Domain";
        String actualTitle = webDriver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title mismatch on Example.com");


    }

    @Description("This test attempts to Validating the navigation to https://www.iana.org/help/example-domains successfully ")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 2)
    public void assertOnIanaHelpUrl() {

        exampleHomePage = new ExampleHomePage(webDriver);
        exampleHomePage.clickMoreInfoLink();
        String expectedURL = "https://www.iana.org/help/example-domains";
        String actualURL = webDriver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Redirected URL mismatch for IANA website");

    }


}


