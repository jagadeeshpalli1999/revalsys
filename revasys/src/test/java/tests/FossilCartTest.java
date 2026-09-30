package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Cartpage;
import pages.ProductdetailPage;
import pages.ProductlistingPage;

public class FossilCartTest extends BaseTest {

    @Test
    public void verifyProductAddToCart() {

        ProductlistingPage productListing =
                new ProductlistingPage(driver);

        ProductdetailPage productDetail = new ProductdetailPage(driver);

        Cartpage cartPage =
                new Cartpage(driver);

        // Verify product listing page
        Assert.assertTrue(
                productListing.isProductListDisplayed(),
                "Product listing is not displayed"
        );

        // Select product
        productListing.clickFirstProduct();

        // Get product price
        String productPrice =
                productDetail.getProductPrice();

        System.out.println(
                "Product Price: " + productPrice
        );

        Assert.assertFalse(
                productPrice.isEmpty(),
                "Product price is not displayed"
        );

        // Add product to cart
        productDetail.clickAddToCart();

        // Open cart
        productDetail.openCart();

        // Verify product in cart
        Assert.assertTrue(
                cartPage.isProductDisplayedInCart(),
                "Product is not displayed in cart"
        );

        // Verify cart count
        int cartCount =
                cartPage.getCartItemCount();

        System.out.println(
                "Cart Count: " + cartCount
        );

        Assert.assertEquals(
                cartCount,
                1,
                "Cart item count is incorrect"
        );

        // Verify subtotal
        String subtotal =
                cartPage.getSubtotal();

        System.out.println(
                "Subtotal: " + subtotal
        );

        Assert.assertFalse(
                subtotal.isEmpty(),
                "Subtotal is not displayed"
        );

        // Verify total
        String total =
                cartPage.getTotal();

        System.out.println(
                "Final Total: " + total
        );

        Assert.assertFalse(
                total.isEmpty(),
                "Final total is not displayed"
        );
    }
}