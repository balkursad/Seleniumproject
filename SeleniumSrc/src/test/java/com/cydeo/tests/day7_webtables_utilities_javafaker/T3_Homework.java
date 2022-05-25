package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_Homework {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://login1.nextbasecrm.com/");
    }
    @Test
    public void TC3(){
        WebElement username = driver.findElement(By.xpath("//input[@name=\"USER_LOGIN\"]"));
        username.sendKeys("helpdesk1@cybertekschool.com");
        WebElement password = driver.findElement(By.xpath("//input[@name=\"USER_PASSWORD\"]"));
        password.sendKeys("UserUser", Keys.ENTER);
        Assert.assertTrue(driver.getTitle().equals("Portal"));

    }
    @AfterMethod
    public void tearDrop(){
        driver.close();
    }
}
