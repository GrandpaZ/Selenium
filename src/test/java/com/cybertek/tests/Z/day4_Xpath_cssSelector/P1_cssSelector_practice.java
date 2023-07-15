package com.cybertek.tests.Z.day4_Xpath_cssSelector;

import com.cybertek.tests.Z.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_practice {
    public static void main(String[] args) {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        WebElement homeLink=driver.findElement(By.cssSelector("a[class='nav-link']"));

        WebElement forgotPasswordHeader=driver.findElement(By.tagName("h2"));

        WebElement emailLabel=driver.findElement(By.cssSelector("label[for='email']"));

        WebElement inputEmail=driver.findElement(By.cssSelector("input[name='email']"));

        WebElement retrievePassword=driver.findElement(By.cssSelector("button[id='form_submit']"));

        WebElement PoweredByCyberTecSchool=driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        System.out.println("Home Link : "+homeLink);
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputEmail.isDisplayed() = " + inputEmail.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());


    }
}
