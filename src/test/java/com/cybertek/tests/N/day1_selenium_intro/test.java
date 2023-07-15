package com.cybertek.tests.N.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        //1-set up the browser driver
        WebDriverManager.chromedriver().setup();
        //2-create instance of selenium web driver
        WebDriver driver=new ChromeDriver();
        //3-get the page
        driver.get("https://www.tesla.com");










    }
}
