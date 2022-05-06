package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_linkTextPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com");

        //driver.findElement(By.linkText("A/B Testing")).click();

        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        String title = driver.getTitle();

        if (title.equals("No A/B Test")){
            System.out.println("Title verification pass");
        }else{
            System.out.println("Title verification fail");
        }

        driver.navigate().back();

        title = driver.getTitle();

        if (title.equals("Practice")){
            System.out.println("Title verification pass");
        }else{
            System.out.println("Title verification fail");
        }











    }
}
