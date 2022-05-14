package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_xpath_getText_getAttribute {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement login = driver.findElement(By.xpath("//input[@name=\"USER_LOGIN\"]"));
        login.sendKeys("incorrect");

        WebElement resetPassword = driver.findElement(By.cssSelector("button[value=\"Reset password\"]"));
        resetPassword.click();

        WebElement errorPage = driver.findElement(By.xpath("//div[@class=\"errortext\"]"));
        String actualError = errorPage.getText();

        if (actualError.equals("Login or E-mail not found")){
            System.out.println("Reset Password verification passed");
        }else{
            System.out.println("Reset Password verification failed");
        }
        driver.close();

    }
}
