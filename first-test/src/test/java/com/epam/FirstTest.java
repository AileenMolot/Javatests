package com.epam;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    private static WebDriver driver;
    @BeforeClass
            public static void setup(){
            System.setProperty("webdriver.chrome.driver","/Users/Alina_Molot/Documents/Drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.google.com/");
    }

    @Test
        public void searchTest(){
        WebElement inputField = driver.findElement(By.xpath("//div[@id ='gs_lc0']/input[@id = 'lst-ib']"));
        inputField.sendKeys("The Beatles");

        WebElement goButton = driver.findElement(By.xpath("//input[@name = 'btnK']"));
        goButton.submit();

        WebElement result = driver.findElement(By.xpath("//h3[@class='r']/a"));
        Assert.assertTrue(result.getText().contains("The Beatles"));
    }
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}
