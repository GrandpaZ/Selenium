package com.cybertek.tests.Z.day6_Test_Dropdowns;

import com.cybertek.tests.Z.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Find_apple {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.apple.com");
        List<WebElement> headerLinks=driver.findElements(By.xpath("//ul[@class='globalnav-list']//li/a"));
        for (int eachLink=1;eachLink<headerLinks.size()-1;eachLink++) {
//            System.out.println(headerLinks.get(eachLink).getText());
            headerLinks.get(eachLink).click();
            Thread.sleep(1000);
            headerLinks = driver.findElements(By.xpath("//ul[@class='globalnav-list']//li/a"));
            System.out.println(" Current title in the page : " + driver.getTitle());

            List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
            System.out.println("allLinks = " + allLinks.size());
        }








    }

}
