package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage {
    WebDriver driver;
    @FindBy(xpath = "//span[normalize-space()='Learn']")
    private WebElement learnButton;
    @FindBy(xpath = "//span[normalize-space()='Learning Materials']")
    private WebElement learningMaterials;
    @FindBy(xpath = "//span[@class='tab-label' and normalize-space()='Web Automation Advance']")
    private WebElement webAutomationTab;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLearn() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(learnButton))
                .click();
    }

    public void clickLearningMaterials() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(learningMaterials))
                .click();
    }

    public void clickWebAutomationTab() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(webAutomationTab))
                .click();
    }



}
