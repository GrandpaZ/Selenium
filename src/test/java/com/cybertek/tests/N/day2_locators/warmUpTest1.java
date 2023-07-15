package com.cybertek.tests.N.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class warmUpTest1 {
    static WebDriver chromeDriver;


   @BeforeClass
   public void setUp(){
      WebDriverManager.chromedriver().setup();
      chromeDriver=new ChromeDriver();
   }


    @Test(priority =1)
    public void titleVerification(){
        chromeDriver.get("https://www.google.com");
        String title=chromeDriver.getTitle();
        Assert.assertEquals(title,"Google","Title is not Google");
    }
    @Test(priority = 2)
    public void searchBar(){
        WebElement searchBar=chromeDriver.findElement(By.name("q"));
        searchBar.click();
        searchBar.sendKeys("Porn", Keys.ENTER);
    }

    @AfterClass
    public void close(){
      chromeDriver.close();
    }

}
