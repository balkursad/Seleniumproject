package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        WebElement login = driver.findElement(By.cssSelector("input[class='login-btn']"));


        if (login.getAttribute("value").equals("Log In")){
            System.out.println("Login button verification passed");
        }else{
            System.out.println("login button verification failed");
        }
        driver.close();



    }
}
