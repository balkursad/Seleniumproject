package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_Title {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://etsy.com");

        driver.findElement(By.xpath("//*[@id=\"gdpr-single-choice-overlay\"]/div/div[2]/div[2]/button")).click();

        WebElement searchInput = driver.findElement(By.name("search_query"));
        searchInput.sendKeys("Wooden spoon"+ Keys.ENTER);

        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith("Wooden spoon")){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }
        Thread.sleep(3000);
        driver.close();






    }
}
