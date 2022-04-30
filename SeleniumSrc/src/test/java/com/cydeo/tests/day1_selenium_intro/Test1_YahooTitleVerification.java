package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_YahooTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://yahoo.com");

        String title = driver.getTitle();

        if (title.equals("Yahoo | Mail, Wetter, Suche, Nachrichten, Finanzen, Sport & mehr")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }


    }
}
