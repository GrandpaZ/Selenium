package com.cybertek.tests.Z.day4_Xpath_cssSelector;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_cssSelector_AmazonTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        WebElement amazonSearchBar=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        Thread.sleep(2000);
        amazonSearchBar.sendKeys("wooden spoon"+ Keys.ENTER);









    }
}
