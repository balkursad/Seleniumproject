package com.cydeo.tests.day5_tesNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_RadioButton {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement HockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));

        HockeyButton.click();

        if (HockeyButton.isSelected()){
            System.out.println("button is selected. Verification Passed");
        }else{
            System.out.println("Button is not selected. Verification failed");
        }


    }
}
