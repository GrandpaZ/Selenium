package com.cybertek.tests.Z.day3_review_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_FaceBook {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        WebElement inputUsername = driver.findElement(By.id("email"));
        inputUsername.sendKeys("something@gmail.com");
        WebElement inputPassword = driver.findElement(By.id("pass"));
        inputPassword.sendKeys("skr6666123"+ Keys.ENTER);
        String expectedTitle = "Log into Facebook";

        Thread.sleep(5000);
        String actualTitle=driver.getTitle();
        if (expectedTitle.equals(expectedTitle)){
            System.out.println("Title Verification Passed!");
        }else {
            System.out.println("Title Verification Failed!");
        }
        Thread.sleep(2000);
        driver.quit();



    }
}
