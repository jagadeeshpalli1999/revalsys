package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import factory.DriverFactory;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        DriverFactory.initializeDriver();

        driver = DriverFactory.getDriver();

        driver.get("https://www.fossil.in/new-arrivals/");
    }

    @AfterMethod
    public void tearDown() {

        DriverFactory.quitDriver();
    }
}