package com.cybertek.tests.N.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
        String expectedTitle="apple - Google Search";
        String actualTitle=driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Search Title Verification Passed !");
        }else {
            System.out.println("Search Title Verification Failed !!!");

        }
        Thread.sleep(2000);
        driver.close();










    }
}
