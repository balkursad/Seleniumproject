package com.cydeo.tests.day4_RadioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        List<WebElement> alllinks = driver.findElements(By.tagName("a"));

        System.out.println("alllinks.size() = " + alllinks.size());

        for (WebElement each : alllinks) {
            System.out.println("Text of Links : "+ each.getText());
            System.out.println("HREF values : "+ each.getAttribute("href"));
        }


    }
}
