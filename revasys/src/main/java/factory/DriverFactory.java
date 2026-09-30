package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class DriverFactory {

    private static WebDriver driver;

    private DriverFactory() {

    }

    public static void initializeDriver() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {

        return driver;
    }

    public static void quitDriver() {

        if (driver != null) {

            driver.quit();

            driver = null;
        }
    }
}