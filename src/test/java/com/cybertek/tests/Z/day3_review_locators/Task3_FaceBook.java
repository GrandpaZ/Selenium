package com.cybertek.tests.Z.day3_review_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_FaceBook {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        WebElement  header = driver.findElement(By.className("_8eso"));
        String expectedHeader="Connect with friends and the world around you on Facebook.";
        String actualHeader=header.getText();

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header Verification Passed!");
        }else {
            System.out.println("Header Verification Failed!");
        }


        System.out.println(header.getAttribute("_8eso"));

//        driver.quit();











    }
}
