package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_Header {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement header = driver.findElement(By.className("page-header"));
        String expectedHeader = "Log in to ZeroBank";
        String actualHeader = header.getText();

        if (expectedHeader.equals(actualHeader)){
            System.out.println("passed");
        }else {
            System.out.println("fail");
        }

        Thread.sleep(5000);


    }
}
