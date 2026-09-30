package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class ProductlistingPage extends BasePage {

    private By productCards =
            By.cssSelector(
                    "[class*='product-card'],"
                    + "[data-testid*='product']"
            );

    private By firstProduct =
            By.cssSelector(
                    "[class*='product-card'] a,"
                    + "[data-testid*='product'] a"
            );

    public ProductlistingPage(WebDriver driver) {

        super(driver);
    }

    public boolean isProductListDisplayed() {

        return isDisplayed(productCards);
    }

    public void clickFirstProduct() {

        click(firstProduct);
    }
}