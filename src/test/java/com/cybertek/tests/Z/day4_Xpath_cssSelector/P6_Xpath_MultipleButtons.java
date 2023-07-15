package com.cybertek.tests.Z.day4_Xpath_cssSelector;

import com.cybertek.tests.Z.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_Xpath_MultipleButtons {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button1=driver.findElement(By.xpath("//button[@onclick='button1()']"));
        System.out.println("button1.isDisplayed() = " + button1.isDisplayed());
        button1.click();
        WebElement resultText=driver.findElement(By.xpath("//p[@id='result']"));
        String expectedText="Clicked on button one!";
        String actualText=resultText.getText();
        if (expectedText.equals(actualText)){
            System.out.println("Verification passed ");
        }else {
            System.out.println("Verification failed ");
        }




    }
}
