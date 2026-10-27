package tests;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.BrowserFactory;
import utils.TakeScreenshots;

public class Base {
    protected WebDriver driver;

    public HomePage homepage;
    public loginPage loginPage;
    public LandingPage landingPage;
    public WebAutomationAdvancePage webAutomationAdvancePage;
    public InventoryReviewPage inventoryReviewPage;
    public TakeScreenshots takeScreenshots = new TakeScreenshots();

    @BeforeClass
    public void setUp() {
        driver = BrowserFactory.startBrowser(
                "chrome",
                "https://ndosisimplifiedautomation.vercel.app/"
        );
        homepage = PageFactory.initElements(driver, HomePage.class);
        loginPage = PageFactory.initElements(driver, loginPage.class);
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        webAutomationAdvancePage = PageFactory.initElements(driver, WebAutomationAdvancePage.class);
        inventoryReviewPage = PageFactory.initElements(driver, InventoryReviewPage.class);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
