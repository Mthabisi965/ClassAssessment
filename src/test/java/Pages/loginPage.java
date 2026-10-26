package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {

    WebDriver driver;

    @FindBy(id = "basics.login-email")
    WebElement usernameField;

    @FindBy(id = "basics.login-password")
    WebElement passwordField;

    @FindBy(id = "basics.login-submit")
    WebElement loginSubmitButton;

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginSubmitButton() {
        loginSubmitButton.click();
    }
}

