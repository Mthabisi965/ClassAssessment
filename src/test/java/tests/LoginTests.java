package tests;

import Pages.WebAutomationAdvancePage;
import org.testng.annotations.Test;



public class LoginTests extends Base{
    @Test
    public void validLoginTest() throws InterruptedException {
        takeScreenshots.takeSnapShot(driver, "BeforeLogin");
        homepage.clickLoginButton();
        loginPage.waitUntilLoaded();
        loginPage.enterUsername("playtest@gmail.com");
        loginPage.enterPassword("1234567!");
        loginPage.clickLoginSubmitButton();
        Thread.sleep(4000);
        landingPage.clickLearn();
        landingPage.clickLearningMaterials();
        landingPage.clickWebAutomationTab();
        webAutomationAdvancePage.waitUntilLoaded();
        webAutomationAdvancePage.selectDeviceType("Tablet");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.selectStorage64GB();
        webAutomationAdvancePage.selectColor("Gold");
        webAutomationAdvancePage.enterQuantity(2);
        webAutomationAdvancePage.enterAddress("123 Main St JHB");
        webAutomationAdvancePage.clickNextButton();
        inventoryReviewPage.selectStandardShipping();
        inventoryReviewPage.selectNoWarrantyUsingLabel();
        inventoryReviewPage.enterDiscountCode("SAVE10");
        inventoryReviewPage.clickApplyDiscount();
        takeScreenshots.takeSnapShot(driver, "AfterLogin");

    }
}
