package com.pageobjectmodel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by devops on 8/11/2016.
 */
public class SamplePage {

    WebDriver driver;

    @BeforeClass
    public void before(){
        driver = new InternetExplorerDriver();
        driver.get("https://www.coursera.org");
    }

    @AfterClass
    public void after(){
        driver.quit();
        driver = null;
    }

    @Test
    public void userIsAbleToLogin(){
        driver.findElement(By.xpath());

    }
}
