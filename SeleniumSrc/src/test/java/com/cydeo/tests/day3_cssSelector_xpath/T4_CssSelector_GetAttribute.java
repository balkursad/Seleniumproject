package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_CssSelector_GetAttribute {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement resetButton = driver.findElement(By.cssSelector("button[class=\"login-btn\"]"));

        if (resetButton.getAttribute("value").equals("Reset password")){
            System.out.println("Reset Password button verification passed");
        }else{
            System.out.println("Reset Password button verification failed");
        }
        driver.close();





    }
}
