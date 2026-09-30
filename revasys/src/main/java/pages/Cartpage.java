package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Cartpage extends BasePage {

    private By cartItems =
            By.cssSelector(
                    "[class*='cart-item'],"
                    + "[data-testid*='cart-item']"
            );

    private By subtotal =
            By.xpath(
                    "//*[contains(translate(normalize-space(.),"
                    + "'ABCDEFGHIJKLMNOPQRSTUVWXYZ',"
                    + "'abcdefghijklmnopqrstuvwxyz'),'subtotal')]/following::*[1]"
            );

    private By total =
            By.xpath(
                    "//*[contains(translate(normalize-space(.),"
                    + "'ABCDEFGHIJKLMNOPQRSTUVWXYZ',"
                    + "'abcdefghijklmnopqrstuvwxyz'),'total')]/following::*[1]"
            );

    public Cartpage(WebDriver driver) {

        super(driver);
    }

    public int getCartItemCount() {

        List<WebElement> items =
                driver.findElements(cartItems);

        return items.size();
    }

    public boolean isProductDisplayedInCart() {

        return isDisplayed(cartItems);
    }

    public String getSubtotal() {

        return getText(subtotal);
    }

    public String getTotal() {

        return getText(total);
    }
}