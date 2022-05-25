package com.cydeo.tests.day6_Alert;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Homework {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void windowTest(){
        driver.get("https://practice.cydeo.com/windows");
        Assert.assertTrue(driver.getTitle().equals("Windows"));
        WebElement clickHere = driver.findElement(By.xpath("//a[@href=\"/windows/new\"]"));
        clickHere.click();

        for (String each  : driver.getWindowHandles() ) {
            driver.switchTo().window(each);
            System.out.println(driver.getTitle());
        }

        Assert.assertTrue(driver.getTitle().equals("New Window"));

    }
}
