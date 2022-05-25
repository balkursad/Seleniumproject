package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    public String WebTableVerify(WebDriver driver, String costumerName){
        WebElement date = driver.findElement(By.xpath("//td[.='"+costumerName +"']/../../tr/td[5]"));

        return date.getText();
    }


    public void orderVerify(WebDriver driver, String costumerName, String expectedOrderDate){
        WebElement date = driver.findElement(By.xpath("//td[.='"+costumerName +"']/../../tr/td[5]"));

        Assert.assertTrue(date.getText().equals(expectedOrderDate));
    }
}
