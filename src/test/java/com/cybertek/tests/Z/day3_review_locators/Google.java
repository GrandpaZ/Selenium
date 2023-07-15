package com.cybertek.tests.Z.day3_review_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement className = driver.findElement(By.className("NKcBbd"));
        String actualClassName=className.getText();
        System.out.println(actualClassName);
        System.out.println(className.getAttribute("rel"));
        System.out.println(className.getAttribute("href"));
    }
}
