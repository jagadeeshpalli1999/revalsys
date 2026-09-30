package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class HomePage extends BasePage {

    private By searchBox =
            By.cssSelector("input[type='search']");

    private By searchButton =
            By.cssSelector("button[type='submit']");

    public HomePage(WebDriver driver) {

        super(driver);
    }

    public void searchProduct(String productName) {

        enterText(searchBox, productName);

        click(searchButton);
    }
}