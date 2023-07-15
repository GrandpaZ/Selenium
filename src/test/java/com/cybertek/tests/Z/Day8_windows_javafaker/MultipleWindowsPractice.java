package com.cybertek.tests.Z.Day8_windows_javafaker;

import com.cybertek.tests.Z.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MultipleWindowsPractice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.tesla.com/");
    }

    @Test
    public void windowHandlePractice(){
        WebElement mondelY=driver.findElement(By.linkText("Model Y"));
        mondelY.click();
        for (String each:driver.getWindowHandles()){
            System.out.println("Title in current page : "+driver.getTitle());
            driver.switchTo().window(each);
        }






    }








}
