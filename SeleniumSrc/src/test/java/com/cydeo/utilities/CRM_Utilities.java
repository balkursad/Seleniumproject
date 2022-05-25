package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    /*
    This method will log in with helpdesk@cybertekschool.com
    user name when it is
     */

    public static void crm_login(WebDriver driver){

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name=\"USER_LOGIN\"]"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name=\"USER_PASSWORD\"]"));
        inputPassword.sendKeys("UserUser");

        WebElement loginButton = driver.findElement(By.xpath("//input[@class=\"login-btn\"]"));
        loginButton.click();
    }

    public static void crm_login(WebDriver driver, String username, String password){

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name=\"USER_LOGIN\"]"));
        inputUsername.sendKeys(username);

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name=\"USER_PASSWORD\"]"));
        inputPassword.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//input[@class=\"login-btn\"]"));
        loginButton.click();
    }
}
