package com.cybertek.tests.N.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3_HeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        // WebElement header=driver.findElement(By.tagName("h3"));
        String actualText=driver.findElement(By.tagName("h3")).getText();
        String expectedText="Log in to ZeroBank";
        if (actualText.equals((expectedText))){
            System.out.println("Header Verification Passed !");
        }else {
            System.out.println("Header Verification Failed !!!");

        }

        driver.quit();

    }
}
