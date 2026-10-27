package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Locale;

public class WebAutomationAdvancePage {
    WebDriver driver;
    @FindBy(id = "deviceType")
    private WebElement deviceTypeDropdown;
    @FindBy(id = "brand")
    private WebElement brandDropdown;
    @FindBy(id = "storage-64GB")
    private WebElement storage64GB;
    @FindBy(id = "color")
    private WebElement colorDropdown;
    @FindBy(id = "quantity")
    private WebElement quantityInput;
    @FindBy(id = "address")
    private WebElement addressInput;
    @FindBy(id = "inventory-next-btn")
    private WebElement nextButton;

    public WebAutomationAdvancePage(WebDriver driver) {
        this.driver = driver;
    }
    public void waitUntilLoaded() {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(deviceTypeDropdown));
    }
    public void selectDeviceType(String deviceType) {
        waitUntilLoaded();
        new Select(deviceTypeDropdown).selectByValue(deviceType.toLowerCase(Locale.ROOT));
    }
    public void selectBrand(String brand) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(brandDropdown));
        Select select = new Select(brandDropdown);
        select.selectByVisibleText(brand);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(driver -> storage64GB.isEnabled());
    }
    public void selectStorage64GB() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(storage64GB));
        storage64GB.click();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeSelected(storage64GB));
    }
    public void selectColor(String color) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(colorDropdown));
        Select select = new Select(colorDropdown);
        select.selectByVisibleText(color);
    }
    public void enterQuantity(int quantity) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(quantityInput));
        quantityInput.clear();
        quantityInput.sendKeys(String.valueOf(quantity));
    }
    public void enterAddress(String address) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(addressInput));
        addressInput.clear();
        addressInput.sendKeys(address);
    }
    public void clickNextButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();
    }

}
