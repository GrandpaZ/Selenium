package com.cybertek.tests.Z.day3_review_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_FaceBook {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle="Facebook - log in or sign up";
        if (actualTitle.contains(expectedTitle)){
            System.out.println(" Title check passed !");
        }else {
            System.out.println(" Title check Failed !");}
        Thread.sleep(2000);
        driver.quit();


    }
}
