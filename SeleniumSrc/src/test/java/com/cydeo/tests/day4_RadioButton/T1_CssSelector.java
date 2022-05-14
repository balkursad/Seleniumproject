package com.cydeo.tests.day4_RadioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_CssSelector {
    public static void main(String[] args) {

        WebDriver driver = new WebDriverFactory().getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");
        WebElement home = driver.findElement(By.cssSelector("a[class=\"nav-link\"]"));

        String expectedHome = "Home";
        String actualHome = home.getText();

        if (expectedHome.equals(actualHome)){
            System.out.println("home verification passed");
        }else{
            System.out.println("home verification failed");
        }

        WebElement forgotPassword = driver.findElement(By.cssSelector("div[class=\"example\"]>h2"));

        if (forgotPassword.getText().equals("Forgot Password")){
            System.out.println("forgot Password verification passed");
        }else{
            System.out.println(forgotPassword.getText());
            System.out.println("forgot Password verification failed");
        }
        WebElement EMailText = driver.findElement(By.cssSelector("label[for=\"email\"]"));

        if (EMailText.getText().equals("E-mail")){
            System.out.println("EmailText verification passed");
        }else{
            System.out.println("EmailText verification failed");
        }

        WebElement inputEmail = driver.findElement(By.cssSelector("input[name=\"email\"]"));

        //if (EMailText.getText().equals(""))


        WebElement RetrievePassword = driver.findElement(By.cssSelector("button#form_submit"));  //#form_submit

        if (RetrievePassword.getText().equals("Retrieve password")){
            System.out.println("RetrievePassword verification passed");
        }else{
            System.out.println("RetrievePassword verification failed");
        }

        WebElement poweredBy = driver.findElement(By.cssSelector("div[style=\"text-align: center;\"]"));
        //WebElement cydeo = driver.findElement(By.cssSelector("a[href=\"https://cydeo.com/\"]"));

        if (poweredBy.getText().equals("Powered by CYDEO")){
            System.out.println("BottomMenu verification passed");
        }else{
            //System.out.println(poweredBy.getText()+"\n"+cydeo.getText());
            System.out.println("BottomMenu verification failed");
        }
        System.out.println("home.isDisplayed() = " + home.isDisplayed());
        System.out.println("forgotPassword.isDisplayed() = " + forgotPassword.isDisplayed());
        System.out.println("EMailText.isDisplayed() = " + EMailText.isDisplayed());
        System.out.println("inputEmail.isDisplayed() = " + inputEmail.isDisplayed());
        System.out.println("RetrievePassword.isDisplayed() = " + RetrievePassword.isDisplayed());
        System.out.println("poweredBy.isDisplayed() = " + poweredBy.isDisplayed());


    }
}
