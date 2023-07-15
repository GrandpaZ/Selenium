package com.cybertek.tests.N.day9;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class forgot_Password {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver drive=new ChromeDriver();
        drive.get("https://mail.yahoo.com/?pspid=2023538075&activity=ybar-mail");
        Thread.sleep(1000);
        drive.findElementByLinkText("Sign in").click();
        String expectedInUrl="https://login.yahoo.com/?.src=ym&pspid=1197806870&activity=header-signin&.lang=en-US&.intl=us&.done=https%3A%2F%2Flocalhost%3A4080%2Fd";
        String actualUrl=drive.getCurrentUrl();
        if (actualUrl.contains(expectedInUrl)){
            System.out.println("Url Verification Passed! ");
        }else {
            System.out.println("Url Verification Failed! ");
        }
        drive.findElementById("mbr-forgot-link").click();
        drive.findElementByClassName("phone-no").sendKeys("uyghur@gmail.com");
        WebElement retrievePasswordButton=drive.findElementByPartialLinkText("Continue");
        Thread.sleep(2000);
        retrievePasswordButton.click();
        Thread.sleep(2000);
        drive.quit();










    }
}
