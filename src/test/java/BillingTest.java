/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

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

/**
 *
 * @author Arwa
 */
public class BillingTest {
    
    public BillingTest() {
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
  public void testBilling() throws Exception {
      WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://www.google.com/");
    driver.get("https://www.advantageonlineshopping.com/#/");
    driver.findElement(By.id("speakersTxt")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='$269.99'])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("//div[@id='productProperties']/div/div[2]/span[4]")).click();
    driver.findElement(By.name("save_to_cart")).click();
    driver.findElement(By.linkText("HOME")).click();
    driver.findElement(By.id("headphonesTxt")).click();
    driver.findElement(By.linkText("HP H2310 In-ear Headset")).click();
    driver.findElement(By.xpath("//div[@id='productProperties']/div/div/span[8]")).click();
    driver.findElement(By.xpath("//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div[3]")).click();
    driver.findElement(By.name("save_to_cart")).click();
    driver.findElement(By.linkText("HOME")).click();
    driver.findElement(By.id("laptopsTxt")).click();
    driver.findElement(By.id("10")).click();
    driver.findElement(By.name("save_to_cart")).click();
    driver.findElement(By.id("checkOutPopUp")).click();
    driver.findElement(By.name("usernameInOrderPayment")).click();
    driver.findElement(By.linkText("SHOPPING CART")).click();
    driver.findElement(By.id("checkOutButton")).click();
    driver.findElement(By.xpath("//div[@id='orderPayment']/div/div/div/sec-form/sec-view/div/label")).click();
    driver.findElement(By.name("usernameInOrderPayment")).clear();
    driver.findElement(By.name("usernameInOrderPayment")).sendKeys("123arwa");
    driver.findElement(By.xpath("//div[@id='orderPayment']/div/div/div/sec-form/sec-view[2]/div/label")).click();
    driver.findElement(By.name("passwordInOrderPayment")).clear();
    driver.findElement(By.name("passwordInOrderPayment")).sendKeys("Shabbir123");
    driver.findElement(By.id("login_btnundefined")).click();
    driver.findElement(By.xpath("//div[@id='orderPayment']/div/div")).click();
    driver.findElement(By.name("usernameInOrderPayment")).clear();
    driver.findElement(By.name("usernameInOrderPayment")).sendKeys("arwa123");
    driver.findElement(By.id("login_btnundefined")).click();
    driver.findElement(By.id("next_btn")).click();
    driver.findElement(By.name("masterCredit")).click();
    driver.findElement(By.id("pay_now_btn_MasterCredit")).click();
  }
}
