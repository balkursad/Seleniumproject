package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {
    WebDriver driver;
    @BeforeMethod
    public void WebTableOrderVerify(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }




    @Test
    public void Test(){
        WebElement bobsName = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr[7]//td[2]"));
        Assert.assertTrue(bobsName.getText().equals("Bob Martin"));
    }
}
