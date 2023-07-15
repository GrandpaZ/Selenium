package com.cybertek.tests.Z.day7_alerts_iframes_windows;

import com.cybertek.tests.Z.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/guru99home/");
    }

    @Test
    public void iframe_test(){

        //driver.switchTo().frame(2);
        //WebElement frame= driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
        //driver.switchTo().frame(frame);
        driver.switchTo().frame("a077aa5e");








    }







}
