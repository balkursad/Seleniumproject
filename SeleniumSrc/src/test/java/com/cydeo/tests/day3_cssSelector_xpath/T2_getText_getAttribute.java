package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        if (rememberMeLabel.getText().equals("Remember me on this computer")){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }

        WebElement forgotPassword = driver.findElement(By.className("login-link-forgot-pass"));

        if (forgotPassword.getText().equals("Forgot your password?")){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }

        WebElement forgetHref = driver.findElement(By.className("login-link-forgot-pass"));
        String href = forgetHref.getAttribute("href");
        if (href.contains("forgot_password=yes")){
            System.out.println("Href verification passed");
        }else{
            System.out.println("Href verification failed");
        }


    }
}
