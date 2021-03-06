/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.sel.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Arwa
 */
public class Tablet {
    
    public Tablet() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
  public void testTabletBuyNow() throws Exception {
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      driver.get("https://www.google.com/");
      driver.get("https://www.advantageonlineshopping.com/#/");
      driver.findElement(By.id("tabletsTxt")).click();
      driver.findElement(By.name("buy_now")).click();
      driver.findElement(By.xpath("//div[@id='productProperties']/div/div/span[2]")).click();
      driver.findElement(By.xpath("//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div[3]")).click();
      driver.findElement(By.name("save_to_cart")).click();
      driver.findElement(By.id("checkOutPopUp")).click();
  }
    
    @Test
    public void testTablet() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.advantageonlineshopping.com/#/");
        driver.findElement(By.id("tabletsTxt")).click();
        driver.findElement(By.id("18")).click();
        driver.findElement(By.xpath("//div[@id='productProperties']/div/div/span[2]")).click();
        driver.findElement(By.xpath("//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div[3]")).click();
        driver.findElement(By.name("save_to_cart")).click();
        driver.findElement(By.id("checkOutPopUp")).click();
  }
    @Test
  public void testTabletFilters() throws Exception {
      WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://www.google.com/");
    driver.get("https://www.advantageonlineshopping.com/#/");
    driver.findElement(By.id("tabletsTxt")).click();
    driver.findElement(By.id("accordionPrice")).click();
    driver.findElement(By.xpath("//div[@id='slider']/div/div/div")).click();
    driver.findElement(By.id("accordionAttrib0")).click();
    driver.findElement(By.id("display_0")).click();
    driver.findElement(By.id("display_1")).click();
    driver.findElement(By.id("accordionAttrib1")).click();
    driver.findElement(By.id("processor_0")).click();
    driver.findElement(By.id("accordionColor")).click();
    driver.findElement(By.id("productsColorsC3C3C3")).click();
    driver.findElement(By.linkText("HP ElitePad 1000 G2 Tablet")).click();
    driver.findElement(By.xpath("//div[@id='productProperties']/div/div/span[2]")).click();
    driver.findElement(By.xpath("//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div[3]")).click();
    driver.findElement(By.xpath("//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div")).click();
    driver.findElement(By.name("save_to_cart")).click();
    driver.findElement(By.id("checkOutPopUp")).click();
  }
  }
  



