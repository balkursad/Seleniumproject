package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getTextGetAttribute {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement headText = driver.findElement(By.className("page-header"));
        String expectedHeaderText = "Registration form";
        String actualHeaderText = headText.getText();

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header Text verification Pass");
        }else{
            System.out.println("Header Text verification Fail");
        }

        WebElement firstName = driver.findElement(By.name("firstname"));
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstName.getAttribute("placeholder");

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("PlaceHolder verification Pass");
        }else{
            System.out.println("PlaceHolder verification Fail");
        }






    }
}
