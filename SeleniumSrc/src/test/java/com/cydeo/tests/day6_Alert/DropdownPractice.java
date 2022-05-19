package com.cydeo.tests.day6_Alert;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractice {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void DropdownTask5() throws InterruptedException {

        Select dropDownMenu = new Select(driver.findElement(By.xpath("//select[@id=\"state\"]")));
        Thread.sleep(1000);
        dropDownMenu.selectByVisibleText("Illinois");

        Thread.sleep(1000);
        dropDownMenu.selectByValue("VA");

        Thread.sleep(1000);
        dropDownMenu.selectByIndex(5);

        Assert.assertEquals(dropDownMenu.getFirstSelectedOption().getText(), "California");

    }

    @Test
    public void DropdownTask6() throws InterruptedException {
        Select dropdownYear = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select dropdownMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dropdownDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        Thread.sleep(1000);
        dropdownYear.selectByVisibleText("1923");

        Thread.sleep(1000);
        dropdownMonth.selectByValue("11");

        Thread.sleep(1000);
        dropdownDay.selectByIndex(0);

        Assert.assertEquals(dropdownYear.getFirstSelectedOption().getText(), "1923");
        Assert.assertEquals(dropdownMonth.getFirstSelectedOption().getText(),"December");
        Assert.assertTrue(dropdownDay.getFirstSelectedOption().getText().equals("1"));
    }

    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }



}
