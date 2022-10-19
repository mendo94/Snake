package com.framework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    @Test
    void usernameIsCorrectOverviewTab() {
        //Arrange
        System.setProperty("webdriver.chrome.driver", "/Users/rinamendoza/Downloads/chromedriver");
        ChromeOptions options = new ChromeOptions().addArguments("start fullscreen");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String user = "mendo94";
        driver.get("https://github.com/" + user);


        // Act
        String actualUsername = driver.findElement(By.className("p-nickname")).getText();


        // Assert
    }
    static int sum(int a, int b) {
        return a + b;
    }
}
