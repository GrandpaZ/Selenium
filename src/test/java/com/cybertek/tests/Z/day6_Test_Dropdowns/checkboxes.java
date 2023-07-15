package com.cybertek.tests.Z.day6_Test_Dropdowns;

import com.cybertek.tests.Z.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class checkboxes {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkBox1= driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        System.out.println("checkBox1 = " + checkBox1.isSelected());
        WebElement checkBox2= driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        System.out.println("checkBox2 = " + checkBox2.isSelected());


    }
}
