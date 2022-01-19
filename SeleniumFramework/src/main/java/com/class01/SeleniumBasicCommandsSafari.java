package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicCommandsSafari {
    public static void main(String[] args) {


        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver","src//main//resources//driver//chromedriver");

        // Open the browser
        ChromeDriver driver = new ChromeDriver();

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

