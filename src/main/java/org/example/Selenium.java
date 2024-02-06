package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver_121.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.rs");
driver.findElement(By.cssSelector("[name=q]")).sendKeys("Torte i kolaci");
driver.findElement(By.cssSelector("[name=q]")).sendKeys(Keys.ENTER);
    }
}
