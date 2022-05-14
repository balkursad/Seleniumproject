package com.cydeo.tests.day4_RadioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_xPath {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement home = driver.findElement(By.xpath("//a[@class='nav-link']"));

        WebElement forgotPassword = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        WebElement eMailText = driver.findElement(By.xpath("//label[@for='email']"));

        WebElement inputEmail = driver.findElement(By.xpath("//input[@name='email']"));

        WebElement retrievePassword = driver.findElement(By.xpath("//button[@id='form_submit']"));

        WebElement poweredByCydeo = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        System.out.println("home.isDisplayed() = " + home.isDisplayed());
        System.out.println("forgotPassword.isDisplayed() = " + forgotPassword.isDisplayed());
        System.out.println("eMailText.isDisplayed() = " + eMailText.isDisplayed());
        System.out.println("inputEmail.isDisplayed() = " + inputEmail.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());


    }
}
