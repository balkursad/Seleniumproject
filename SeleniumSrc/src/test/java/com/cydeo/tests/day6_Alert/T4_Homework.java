package com.cydeo.tests.day6_Alert;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Homework {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void iframeTest(){
        driver.get("https://practice.cydeo.com/iframe");
        driver.switchTo().frame("mce_0_ifr");

        WebElement text = driver.findElement(By.xpath("//p"));
        Assert.assertEquals(text.getText(), "Your content goes here.");
        text.clear();
        text.sendKeys("can i write here?");

        driver.switchTo().parentFrame();

        WebElement title = driver.findElement(By.xpath("//h3"));

        Assert.assertEquals(title.getText(), "An iFrame containing the TinyMCE WYSIWYG Editor");





    }

}
