package com.cybertek.tests.N.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2_TitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://etsy.com");
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon"+ Keys.ENTER);
        String expectingTitle="Wooden spoon - Etsy";
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.equals(expectingTitle)){
            System.out.println("Title Verification Passed !");
        }else {
            System.out.println("Search Title Verification Failed !!!");
        }

        driver.quit();





    }
}
