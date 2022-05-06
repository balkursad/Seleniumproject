package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com");

        driver.manage().window().maximize();

        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("cydeo")){
            System.out.println("URL verification PASSED");
        }else{
            System.out.println("URL verification FAILED");
        }

        String title = driver.getTitle();

        if (title.equals("Practice")){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }

        driver.close();






    }
}
