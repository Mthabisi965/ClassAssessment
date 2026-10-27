package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryReviewPage {
    WebDriver driver;
    @FindBy(id = "shipping-standard")
    private WebElement shippingStandardRadioButton;
    @FindBy(id = "warranty-none")
    WebElement noWarrantyRadioButton;
    @FindBy(id = "discount-code")
    WebElement discountCodeInput;
    @FindBy(id = "apply-discount-btn")
    private WebElement applyDiscountButton;

    public InventoryReviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectStandardShipping() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(shippingStandardRadioButton)).click();
        wait.until(ExpectedConditions.elementToBeSelected(shippingStandardRadioButton));
    }

    public void selectNoWarrantyUsingLabel() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(noWarrantyRadioButton)).click();
        wait.until(ExpectedConditions.elementToBeSelected(noWarrantyRadioButton));
        Thread.sleep(2000);
    }
    public WebElement waitForDiscountInput() {
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("discount-code")
                )
        );
    }
    public void enterDiscountCode(String code) {
        WebElement discountInput = waitForDiscountInput();
        discountInput.clear();
        discountInput.sendKeys(code);
    }
    public void clickApplyDiscount() {
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(
                applyDiscountButton
        )).click();
    }

}
