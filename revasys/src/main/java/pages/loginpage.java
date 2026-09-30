package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

    WebDriver driver;

    public loginpage(WebDriver driver) {

        this.driver = driver;

    }

    By signIn = By.xpath("//button[normalize-space()='Sign in']");

    By mobileNumber = By.xpath("//input[@id='phoneInput']");

    By continueButton = By.cssSelector("form[class='jsx-22b9c7f0f5d51ecd']");


    public void clickSignIn() {

        driver.findElement(signIn).click();

    }


    public void enterMobileNumber(String mobile) {

        driver.findElement(mobileNumber).sendKeys(mobile);

    }


    public void clickContinue() {

        driver.findElement(continueButton).click();

    }

}