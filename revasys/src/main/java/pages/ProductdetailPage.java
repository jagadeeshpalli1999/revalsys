package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class ProductdetailPage extends BasePage {

    private By productName =
            By.cssSelector(
                    "h1, [class*='product-name']"
            );

    private By productPrice =
            By.cssSelector(
                    "[class*='price'],"
                    + "[data-testid*='price']"
            );

    private By addToCartButton =
            By.xpath(
                    "//button[contains(translate(normalize-space(.),"
                    + "'ABCDEFGHIJKLMNOPQRSTUVWXYZ',"
                    + "'abcdefghijklmnopqrstuvwxyz'),'add to cart')"
                    + " or contains(translate(normalize-space(.),"
                    + "'ABCDEFGHIJKLMNOPQRSTUVWXYZ',"
                    + "'abcdefghijklmnopqrstuvwxyz'),'add to bag')]"
            );

    private By cartButton =
            By.cssSelector(
                    "a[href*='cart'],"
                    + "button[aria-label*='cart' i],"
                    + "a[aria-label*='cart' i]"
            );

    public ProductdetailPage(WebDriver driver) {

        super(driver);
    }

    public String getProductName() {

        return getText(productName);
    }

    public String getProductPrice() {

        return getText(productPrice);
    }

    public void clickAddToCart() {

        click(addToCartButton);
    }

    public void openCart() {

        click(cartButton);
    }
}