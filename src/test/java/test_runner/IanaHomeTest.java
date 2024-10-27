package test_runner;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.WebTestBase;
import utils.actions.WebActions;
import web_ui.IanaHomePage;

public class IanaHomeTest extends WebTestBase {
    IanaHomePage homePage;

    @Description("This test attempts to Validating the navigation to https://www.iana.org/about and Scroll into Terms ")
    @Severity(SeverityLevel.NORMAL)
    @Test()
    public void assertOnIanaNavigatedUrl() {
        homePage = new IanaHomePage(webDriver);
        webDriver.get("https://www.iana.org/about");
        WebActions.scrollIntoView(webDriver, homePage.getTermsOfServiceElement());
        homePage.getTermsOfServiceElement().click();
        // Verify navigation to TERMS OF SERVICE page
        String expectedTermsTitle = "TERMS OF SERVICE";
        String actualTermsTitle = webDriver.getTitle();
        Assert.assertTrue(actualTermsTitle.contains(expectedTermsTitle), "Terms of Service page title mismatch");

    }
}
