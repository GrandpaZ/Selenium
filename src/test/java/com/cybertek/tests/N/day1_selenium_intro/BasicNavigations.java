package com.cybertek.tests.N.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1-set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2-create instance of selenium web driver
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        //3-get the page for Tesla.com
        driver.get("https://tesla.com");

        System.out.println("Current title: "+driver.getTitle());
        System.out.println("Current url: "+driver.getCurrentUrl());


        //putting 3 second of wait/stop the code for 3sec
        Thread.sleep(2000);

        //going back using navigations
        driver.navigate().back();

        //putting 3 second of wait/stop the code for 3sec
        Thread.sleep(2000);

        //going forward using navigations
        driver.navigate().forward();

        //putting 3 second of wait/stop the code for 3sec
        Thread.sleep(2000);

        //Refreshing the page using navigations
        driver.navigate().refresh();

        //going to another url using.to() method
        driver.navigate().to("http://www.google.com");

        System.out.println("Current title: "+driver.getTitle());
        System.out.println("Current url: "+driver.getCurrentUrl());
        System.out.println("this is leo ");







    }
}
