package com.cybertek.tests.N.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class warmUpTest2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.linkText("Gmail")).click();
        String expectedTitle1="Gmail";
        String actualTitle1=driver.getTitle();
        if (actualTitle1.contains(expectedTitle1)){
            System.out.println("Title Verification Passed !");
        }else {
            System.out.println("Title Verification Failed !!!");
        }
        driver.navigate().back();
        String expectedTitle2="Google";
        String actualTitle2=driver.getTitle();
        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("Title Verification Passed !");
        }else {
            System.out.println("Title Verification Failed !!!");
        }
        driver.findElement(By.linkText("About")).click();
        driver.quit();
    }
}
