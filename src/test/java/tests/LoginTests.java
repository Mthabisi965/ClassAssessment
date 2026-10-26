package tests;

import org.testng.annotations.Test;



public class LoginTests extends Base{
    @Test
    public void validLoginTest() throws InterruptedException {
        takeScreenshots.takeSnapShot(driver, "BeforeLogin");
        homepage.clickLoginButton();
        loginPage.enterUsername("playtest@gmail.com");
        loginPage.enterPassword("1234567!");
        loginPage.clickLoginSubmitButton();
        Thread.sleep(4000);
        landingPage.verifyLoginSuccess();
        takeScreenshots.takeSnapShot(driver, "AfterLogin");

    }
}
