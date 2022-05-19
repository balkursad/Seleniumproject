package com.cydeo.tests.day4_RadioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T3_Xpath_HomeWork {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/multiple_buttons");

        WebElement button1 = driver.findElement(By.xpath("//button[.='Button 1']"));
        button1.click();

        System.out.println("driver.findElement(By.xpath(\"//p[@id='result']\")).isDisplayed() = " + driver.findElement(By.xpath("//p[@id='result']")).isDisplayed());


    }
}
