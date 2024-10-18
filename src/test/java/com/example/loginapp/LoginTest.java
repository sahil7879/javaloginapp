package com.example.loginapp;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {

    @Test
    public void testLogin() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver"); // Set this to your ChromeDriver path
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://localhost:8080/login");
        
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));

        usernameField.sendKeys("user");
        passwordField.sendKeys("password");
        submitButton.click();

        WebElement welcomeMessage = driver.findElement(By.tagName("h2"));
        assertEquals("Welcome user", welcomeMessage.getText());

        driver.quit();
    }
}
