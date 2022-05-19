package com.cydeo.tests.day5_tesNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @AfterMethod
    public void finish(){
        driver.close();
    }

    @Test
    public void simpleDropdownTest(){
        Select simpleDropdown = new Select(driver.findElement(By.cssSelector("select[id=\"dropdown\"]")));

        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

        Assert.assertEquals(currentlySelectedOption.getText(), "Please select an option");

        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id=\"state\"]")));

        WebElement currentlySelectedState = stateSelection.getFirstSelectedOption();

        Assert.assertEquals(currentlySelectedState.getText(), "Select a State");
    }

}
