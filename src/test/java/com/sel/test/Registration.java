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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Arwa
 */
public class Registration {
    
    public Registration() {
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
  public void testRegistration() throws Exception {
      WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://www.google.com/");
    driver.get("https://www.advantageonlineshopping.com/#/");
    driver.findElement(By.id("speakersTxt")).click();
    driver.findElement(By.id("25")).click();
    driver.findElement(By.xpath("//div[@id='productProperties']/div/div[2]/span[4]")).click();
    driver.findElement(By.name("save_to_cart")).click();
    driver.findElement(By.linkText("HOME")).click();
    driver.findElement(By.id("laptopsImg")).click();
    driver.findElement(By.id("2")).click();
    driver.findElement(By.xpath("//div[@id='productProperties']/div/div[2]/span[4]")).click();
    driver.findElement(By.name("save_to_cart")).click();
    driver.findElement(By.linkText("HOME")).click();
    driver.findElement(By.id("miceTxt")).click();
    driver.findElement(By.linkText("Kensington Orbit 72352 Trackball")).click();
    driver.findElement(By.xpath("//div[@id='productProperties']/div/div/span[2]")).click();
    driver.findElement(By.name("save_to_cart")).click();
    driver.findElement(By.id("menuCart")).click();
    driver.findElement(By.id("checkOutButton")).click();
    driver.findElement(By.id("registration_btnundefined")).click();
    driver.findElement(By.xpath("//div[@id='formCover']/div/div/sec-view/div/label")).click();
    driver.findElement(By.name("usernameRegisterPage")).clear();
    driver.findElement(By.name("usernameRegisterPage")).sendKeys("Insi");
    driver.findElement(By.xpath("//div[@id='formCover']/div/div/sec-view[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='formCover']/div/div/sec-view/div")).click();
    driver.findElement(By.name("usernameRegisterPage")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | name=usernameRegisterPage | ]]
    driver.findElement(By.name("usernameRegisterPage")).click();
    driver.findElement(By.name("usernameRegisterPage")).clear();
    driver.findElement(By.name("usernameRegisterPage")).sendKeys("Insiya");
    driver.findElement(By.xpath("//div[@id='formCover']/div/div/sec-view[2]/div/label")).click();
    driver.findElement(By.name("emailRegisterPage")).clear();
    driver.findElement(By.name("emailRegisterPage")).sendKeys("insi_9@gmail.com");
    driver.findElement(By.name("passwordRegisterPage")).click();
    driver.findElement(By.name("passwordRegisterPage")).clear();
    driver.findElement(By.name("passwordRegisterPage")).sendKeys("123Insi");
    driver.findElement(By.xpath("//div[@id='formCover']/div/div[2]/sec-view[2]/div/label")).click();
    driver.findElement(By.name("confirm_passwordRegisterPage")).clear();
    driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("123Insi");
    driver.findElement(By.name("first_nameRegisterPage")).click();
    driver.findElement(By.name("first_nameRegisterPage")).clear();
    driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Insiya");
    driver.findElement(By.name("last_nameRegisterPage")).click();
    driver.findElement(By.name("last_nameRegisterPage")).clear();
    driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Shabbir");
    driver.findElement(By.xpath("//div[@id='formCover']/div[2]/div[2]/sec-view/div/label")).click();
    driver.findElement(By.name("phone_numberRegisterPage")).clear();
    driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("2344566676");
    driver.findElement(By.name("countryListboxRegisterPage")).click();
    driver.findElement(By.name("countryListboxRegisterPage")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | name=countryListboxRegisterPage | ]]
    driver.findElement(By.name("countryListboxRegisterPage")).click();
    new Select(driver.findElement(By.name("countryListboxRegisterPage"))).selectByVisibleText("Australia");
    driver.findElement(By.name("cityRegisterPage")).click();
    driver.findElement(By.name("cityRegisterPage")).clear();
    driver.findElement(By.name("cityRegisterPage")).sendKeys("Melborne");
    driver.findElement(By.name("addressRegisterPage")).click();
    driver.findElement(By.name("addressRegisterPage")).clear();
    driver.findElement(By.name("addressRegisterPage")).sendKeys("ehfhgjgg");
    driver.findElement(By.xpath("//div[@id='formCover']/div[3]/div[2]/sec-view[2]/div/label")).click();
    driver.findElement(By.name("state_/_province_/_regionRegisterPage")).clear();
    driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("Victoria");
    driver.findElement(By.name("postal_codeRegisterPage")).click();
    driver.findElement(By.name("postal_codeRegisterPage")).clear();
    driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("57686");
    driver.findElement(By.name("i_agree")).click();
    driver.findElement(By.id("register_btnundefined")).click();
    
  }
}
