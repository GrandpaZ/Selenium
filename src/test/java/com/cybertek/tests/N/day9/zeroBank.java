package com.cybertek.tests.N.day9;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class zeroBank {
    public static void main(String[] args) {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
//        WebDriverManager.chromedriver().setup();
//        ChromeDriver drive=new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement zeroBankLinkTopleft=driver.findElement(By.name("brand"));
        String expectedLinkTest ="zero bank";
        String actualLinkTest=zeroBankLinkTopleft.getText();
        if (actualLinkTest.contains(expectedLinkTest)){
            System.out.println("Link Text Verification Passed !");
        }else {
            System.out.println("Link Text Verification Failed !");}
        driver.findElement(By.linkText("Forgot your password ?")).click();
        driver.findElement(By.id("user_email")).sendKeys("HarryPotter@gmail.com");
        driver.findElement(By.partialLinkText("Send Password")).click();












    }
}
