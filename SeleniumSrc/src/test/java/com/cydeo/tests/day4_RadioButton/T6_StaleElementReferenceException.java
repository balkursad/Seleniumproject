package com.cydeo.tests.day4_RadioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferenceException {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get("http://practice.cydeo.com/abtest");

        WebElement cydeoLink = driver.findElement(By.xpath("//a[.='CYDEO']"));
        //System.out.println("cydeoLink.getText() = " + cydeoLink.getText());

        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        driver.navigate().refresh();

        cydeoLink = driver.findElement(By.xpath("//a[.='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        WebElement home = driver.findElement(By.linkText("Home"));
        home.click();


    }
}
