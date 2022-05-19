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

public class T5_T6_T7_T8 {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test (priority = 1)
    public void TC5() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/dropdown");
        Select state = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        Thread.sleep(2000);
        state.selectByVisibleText("Illinois");

        Thread.sleep(2000);
        state.selectByValue("VA");

        Thread.sleep(2000);
        state.selectByIndex(5);

        Assert.assertTrue(state.getFirstSelectedOption().getText().equals("California"));

    }

    @Test (priority = 2)
    public void TC6() throws InterruptedException {

        driver.get("https://practice.cydeo.com/dropdown");
        Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        Thread.sleep(2000);
        year.selectByVisibleText("1923");

        Thread.sleep(2000);
        month.selectByValue("11");

        Thread.sleep(2000);
        day.selectByIndex(0);

        Assert.assertTrue(year.getFirstSelectedOption().getText().equals("1923"));
        Assert.assertTrue(month.getFirstSelectedOption().getText().equals("December"));
        Assert.assertEquals(day.getFirstSelectedOption().getText(), "1");
    }

    @Test(priority = 3)
    public void TC7() throws InterruptedException {
        driver.get("https://practice.cydeo.com/dropdown");
        WebElement non_selectDropdown = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        non_selectDropdown.click();
        driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/\"]")).click();
        Thread.sleep(2000);


        Assert.assertTrue(driver.getTitle().equals("Facebook - Giriş Yap veya Kaydol"));
    }

   /*@Test (priority = 4)
    public void TC8() throws InterruptedException {
        driver.get("https://practice.cydeo.com/dropdown");
        Select multiSelectDropdown1 = new Select(driver.findElement(By.xpath("//select[@name=\"Languages\"]")));
        Select multiSelectDropdown2 = new Select(driver.findElement(By.xpath("//select[@name=\"Languages\"]")));

        Thread.sleep(2000);
        multiSelectDropdown1.selectByVisibleText("Java");
        multiSelectDropdown2.selectByVisibleText("js");
       // multiSelectDropdown.selectByVisibleText("JavaScript");
        //multiSelectDropdown.selectByVisibleText("C#");
       // multiSelectDropdown.selectByVisibleText("Python");
        //multiSelectDropdown.selectByVisibleText("Ruby");
      // multiSelectDropdown.selectByVisibleText("C");

        //System.out.println("multiSelectDropdown.getAllSelectedOptions() = " + multiSelectDropdown.getAllSelectedOptions());
        Thread.sleep(3000);
       // multiSelectDropdown.deselectAll();


    }

    */
    @AfterMethod
    public void tearDrop(){
        driver.close();
        }

    }
