package com.cydeo.tests.day5_tesNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ReviewClassExtraPractice {


    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testautomationpractice.blogspot.com/");
    }



    @Test
    public void checkBoxTest() throws InterruptedException {

        List<WebElement> days = driver.findElements(By.xpath("//input[@name=\"RESULT_CheckBox-8\"]"));
        for (WebElement eachDay : days) {
            eachDay.click();
        }

        for (WebElement eachDay : days) {
            Assert.assertTrue(eachDay.isSelected());
        }




    }
    /*@Test
    public void Dropdown() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select contact = new Select(driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]")));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        contact.selectByIndex(1);
        Thread.sleep(3000);
        Assert.assertTrue(contact.getFirstSelectedOption().getText().equals("Morning"));
    }

     */




}
