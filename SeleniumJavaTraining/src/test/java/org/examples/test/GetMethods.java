package org.examples.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        String source = driver.getPageSource();

        System.out.print(url+ "\n" + title +"\n");

        if (source.contains("en-IN")){
            System.out.println("Text is Present in the source Code.");
        }
        else{
            System.out.println("Text is not present in the source Code.");
        }
    }
}
