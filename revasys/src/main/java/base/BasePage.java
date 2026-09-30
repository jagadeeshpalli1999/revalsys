package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {

        this.driver = driver;

        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(20)
        );
    }

    // Wait for element to be visible
    protected WebElement waitForElement(By locator) {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );
    }

    // Wait for element to be clickable
    protected WebElement waitForClickable(By locator) {

        return wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        );
    }

    // Click element
    protected void click(By locator) {

        waitForClickable(locator).click();
    }

    // Enter text
    protected void enterText(By locator, String text) {

        WebElement element = waitForElement(locator);

        element.clear();

        element.sendKeys(text);
    }

    // Get text
    protected String getText(By locator) {

        return waitForElement(locator).getText();
    }

    // Check element displayed
    protected boolean isDisplayed(By locator) {

        return waitForElement(locator).isDisplayed();
    }

    // Open URL
    protected void openUrl(String url) {

        driver.get(url);
    }

    // Click Sign In
    public void clickSignIn() {

        By signInButton = By.xpath(
                "//button[contains(translate(normalize-space(.),"
                + "'ABCDEFGHIJKLMNOPQRSTUVWXYZ',"
                + "'abcdefghijklmnopqrstuvwxyz'),'sign in')]"
                + " | //a[contains(translate(normalize-space(.),"
                + "'ABCDEFGHIJKLMNOPQRSTUVWXYZ',"
                + "'abcdefghijklmnopqrstuvwxyz'),'sign in')]"
        );

        click(signInButton);
    }
}