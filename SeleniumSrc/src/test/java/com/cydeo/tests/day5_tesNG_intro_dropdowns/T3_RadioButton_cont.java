package com.cydeo.tests.day5_tesNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        //Locate name='sport' radio buttons and store them in a list of Web element

       /* List<WebElement> sportRadioButtons = driver.findElements(By.name("sport"));

        for (WebElement each : sportRadioButtons) {
            String eachId = each.getAttribute("id");

            System.out.println("eachId = " + eachId);

            if (eachId.equals("Hockey")) {
                each.click();
                System.out.println("Hockey is selected" + each.isSelected());
                break;
            }
        }

        */
        clickAndVerifyRadioButton(driver, "sport", "hockey");

        clickAndVerifyRadioButton(driver, "sport", "football");

        clickAndVerifyRadioButton(driver, "color", "yellow");


    }


    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {


        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        //Loop through the List of WebElement and select matching result "hockey"
        for (WebElement each : radioButtons) {
            String eachId = each.getAttribute("id");

            if (eachId.equals(idValue)) {

                each.click();
                System.out.println(eachId + " is selected : " + each.isSelected());
                break;
            }
        }
    }
}
