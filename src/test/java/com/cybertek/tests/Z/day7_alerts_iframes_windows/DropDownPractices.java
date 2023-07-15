package com.cybertek.tests.Z.day7_alerts_iframes_windows;

import com.cybertek.tests.Z.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDownPractices {
        WebDriver driver;
    @BeforeClass
    public void setupClass(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/newtours/register.php");
    }

    @Test
    public void tc1_simple_dropdown_test() {
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@name='country']")));
        WebElement textOfCurrentOption = simpleDropdown.getFirstSelectedOption();
        String actualText = textOfCurrentOption.getText();
        String expectedText = "ALBANIA";
        Assert.assertTrue(actualText.equals(expectedText));
        System.out.println(expectedText + " = expected Text");
    }
    @Test
    public void tc2_simlpe_dropdown_text(){

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@name='country']")));
        stateDropdown.selectByVisibleText("BRAZIL");
        stateDropdown.selectByVisibleText("FIJI");
        String expectedText = "FIJI";
        String actualText=stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualText,expectedText,"It is Wrong");


    }











@AfterClass
        public void tearDownClass() throws InterruptedException {
        Thread.sleep(5000);
          driver.close();
        }



    }








