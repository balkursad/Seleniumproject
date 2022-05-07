package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_Google {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement accept = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        accept.click();

        WebElement gmail = driver.findElement(By.className("gb_d"));
        gmail.click();

        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Gmail")){
            System.out.println("Gmail title verification Passed");
        }else {
            System.out.println("Gmail title verification failed");
        }

        driver.navigate().back();

        String homePageTitle = driver.getTitle();
        String expectedTitle = "Google";
        if (expectedTitle.equals(homePageTitle)){
            System.out.println("HomePage title verification passed");
        }else{
            System.out.println("HomePage title verification failed");
        }
        driver.close();



    }
}
