package com.BrowserTestExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeBrowserPractice {

    @Test(priority = 0)
    public void Link1Test() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        //driver.quit();
    }

    @Test(priority = 1)
    public void Link2Test() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        //driver.quit();
    }

    @Test(priority = 2)
    public void Link3Test() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.bing.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        //driver.quit();
    }

    @Test(priority = 3)
    public void Link4Test() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.freecrm.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        //driver.quit();
    }

    @Test(priority = 4)
    public void Link5Test() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.chase.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        //driver.quit();
    }

    @Test(priority = 5)
    public void Link6Test() {
        WebDriver driver = new EdgeDriver();
        driver.get("http://altoro.testfire.net/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        //driver.quit();
    }

    @Test(priority = 6)
    public void Link7Test() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://practicetestautomation.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        //driver.quit();
    }

    @Test(priority = 7)
    public void Link8Test() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        //driver.quit();
    }

    @Test(priority = 8)
    public void Link9Test() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        //driver.quit();
    }
}

	