package com.cybertek.tests.Z.day3_review_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class attribute_Value_Verification {
    public static void main(String[] args) {

     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://www.facebook.com");
     WebElement createPageLink=driver.findElement(By.linkText("Create a Page"));
     String expectedInHref="registration_from";
     String actualHrefValue=createPageLink.getAttribute("href");
     System.out.println("actualHrefValue = "+actualHrefValue);
        if (actualHrefValue.equals(expectedInHref)) {
            System.out.println("HrefValue Verification Passed !");
        }else {
            System.out.println("HrefValue Verification Failed !");
        }






    }}
