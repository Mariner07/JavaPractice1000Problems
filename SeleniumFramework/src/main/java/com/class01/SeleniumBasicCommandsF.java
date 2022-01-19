package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class SeleniumBasicCommandsF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String browser = sc.nextLine();
        WebDriver driver;

        switch (browser){
            case "firefox":
                // Setting path to chromedriver.exe
                System.setProperty("webdriver.gecko.driver","src//main//resources//driver//geckodriver");
                driver = new FirefoxDriver();
            case "chrome":
                System.setProperty("webdriver.chrome.driver","src//main//resources//driver//chromedriver");
                // Open the browser
                driver = new ChromeDriver();

        }

        // 1. To open url in browser
        driver.get("https://www.ebay.com/");

        //Find an element
        WebElement searchBox = driver.findElement(By.id("gh-ac"));

        //type smth in an input element
        searchBox.sendKeys("TV");

        String text =  searchBox.getAttribute("placeholder");
        System.out.println(text);

        WebElement searchBtn = driver.findElement(By.id("gh-btn"));
        //clicking
        searchBtn.click();

        WebElement footerWarning = driver.findElement(By.xpath("//td[@class='gf-legal']"));
        System.out.println(footerWarning.getText());

// To use submit method the element should have type="submit" attribute
// searchBtn.submit();
    }
}

