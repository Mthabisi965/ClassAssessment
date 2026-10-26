package tests;

import Pages.HomePage;
import Pages.LandingPage;
import Pages.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserFactory;
import utils.TakeScreenshots;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");

    public HomePage homepage = PageFactory.initElements(driver, HomePage.class);
    public loginPage loginPage = PageFactory.initElements(driver, loginPage.class);
    public LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    public TakeScreenshots takeScreenshots = new TakeScreenshots();
}
