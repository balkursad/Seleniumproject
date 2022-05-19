package com.cydeo.tests.day6_Alert;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");
    }


    @Test
    public void multiple_window_test(){
        String mainHandle = driver.getWindowHandle();

        System.out.println("mainHandle = " + mainHandle);

        Assert.assertEquals(driver.getTitle(),"Windows");

        System.out.println("BeforeClickTitle : " + driver.getTitle());

        WebElement clickHereLink = driver.findElement(By.xpath("//a[@href=\"/windows/new\"]"));

        clickHereLink.click();

        String afterClickTitle = driver.getTitle();

        System.out.println("afterClickTitle = " + afterClickTitle);

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows " + driver.getTitle());
        }
            String expectedTitleAfterClick = "New Window";
            String actualTitle = driver.getTitle();

            Assert.assertEquals(actualTitle, expectedTitleAfterClick);

            System.out.println("Title after click : "+ driver.getTitle());





    }

}
