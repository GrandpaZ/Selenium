package com.cybertek.tests.Z.day7_alerts_iframes_windows;

import com.cybertek.tests.Z.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowPractice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.tesla.com/");
    }

    @Test
    public void window_test(){
        String titleBeforeClick=driver.getTitle();
        String expectedTileBeforeClick="Model Y | Tesla";
        System.out.println("Actual Title Before Click = "+titleBeforeClick);
        WebElement modelY=driver.findElement(By.linkText("Model Y"));
        modelY.click();
        String titleAfterClick=driver.getTitle();
        System.out.println("Actual Title After Click = "+titleAfterClick);
        Assert.assertEquals(expectedTileBeforeClick,titleAfterClick,"Didn't match expected");
        String mainHandle=driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);










}}
