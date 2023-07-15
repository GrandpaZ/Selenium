package com.cybertek.tests.Z.day9_properties_browser_utils;

import com.cybertek.tests.Z.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P1_Library_Login {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://library2.cybertekschool.com/login.html");
    }

    public void loginToLibrary(){
        WebElement username= driver.findElement(By.xpath("//input[@id='inputEmail']"));
        username.sendKeys("student11@library");
        WebElement password=driver.findElement(By.cssSelector("input[id='inputPassword']"));
        password.sendKeys("tScBPCUr");
        WebElement login=driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']"));
        login.click();
    }




    @Test
    public void login_link_account_test(){

        loginToLibrary();







    }
}
