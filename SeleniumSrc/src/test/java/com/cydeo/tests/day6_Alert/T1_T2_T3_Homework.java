package com.cydeo.tests.day6_Alert;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_T2_T3_Homework {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void TC1(){
        WebElement JsAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        JsAlert.click();
        Alert alert = driver.switchTo().alert();

        alert.accept();

        Assert.assertTrue(driver.findElement(By.xpath("//p[@id=\"result\"]")).getText().equals("You successfully clicked an alert"));
    }

    @Test
    public void TC2(){
        WebElement JsConfirm = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        JsConfirm.click();

        Alert alert = driver.switchTo().alert();

        alert.dismiss();

        Assert.assertTrue(driver.findElement(By.xpath("//p[@id=\"result\"]")).getText().equals("You clicked: Cancel"));

        JsConfirm.click();

        alert.accept();

        Assert.assertTrue(driver.findElement(By.xpath("//p[@id=\"result\"]")).getText().equals("You clicked: Ok"));
    }

    @Test
    public void TC3(){
        WebElement JsPrompt = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        JsPrompt.click();

        Alert alert = driver.switchTo().alert();

        alert.sendKeys("Java");
        alert.accept();

        System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
        Assert.assertTrue(driver.findElement(By.xpath("//p[@id='result']")).getText().equals("You entered: Java"));

        JsPrompt.click();

        alert.dismiss();

        Assert.assertTrue(driver.findElement(By.xpath("//p[@id=\"result\"]")).getText().equals("You entered: null"));

    }

    @AfterMethod
    public void tearDrop(){
        driver.close();
    }
}
