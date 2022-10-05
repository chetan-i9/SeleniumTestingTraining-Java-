package org.examples.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        String val=driver.findElement(By.name("btnK")).getAttribute("value");
        System.out.println(val);
    }
}
