package com.cybertek.tests.Z.day7_alerts_iframes_windows;

import com.cybertek.tests.Z.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractices {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/delete_customer.php");
    }


    @Test
    public void information_alert(){
        WebElement informationAlertButton=driver.findElement(By.xpath("//input[@value='Submit']"));
        informationAlertButton.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        String alertText=alert.getText();
        String expectText="Customer Successfully Delete!";
        Assert.assertEquals(alertText,expectText,"Result text is not displayed on the page . ");




    }
//    @AfterClass
//    public void tearDown(){
//        driver.close();
//    }
}
