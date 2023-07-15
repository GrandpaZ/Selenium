package com.cybertek.tests.N.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.google.com/");
        Thread.sleep(2000);
        chromeDriver.navigate().back();
        Thread.sleep(2000);
        chromeDriver.navigate().forward();
        Thread.sleep(2000);
        chromeDriver.navigate().refresh();
        System.out.println("Title of the Web Page : "+chromeDriver.getTitle());
        System.out.println("Url of the Web Page : "+chromeDriver.getCurrentUrl());
        chromeDriver.navigate().to("https://www.tesla.com/");
        System.out.println("Title of the Web Page : "+chromeDriver.getTitle());
        System.out.println("Url of the Web Page : "+chromeDriver.getCurrentUrl());
        chromeDriver.navigate().to("https://www.tesla.com/modely/design#overview");
        chromeDriver.manage().window().maximize();
        chromeDriver.close();









    }
}