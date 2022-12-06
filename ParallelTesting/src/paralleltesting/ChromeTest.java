/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paralleltesting;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.firefox.FirefoxDriver.*;

/**
 *
 * @author joses
 */
public class ChromeTest extends Thread {

    static WebDriver driver;

    public ChromeTest() {
    }

    
    public void prueba1() {
        
        String driverPath = "D:\\Users\\Fran\\Escritorio\\G7-SC405\\chromedriver.exe";
        String url = "https://www.opencart.com/index.php?route=account/login";
        System.setProperty("webdriver.chrome.driver", driverPath);

        System.out.println("Test Initiated");

        try {
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            

            driver.findElement(By.id("input-email")).sendKeys("iaraya20562@ufide.ac.cr"); //Usuario Registrado

            driver.findElement(By.id("input-password")).sendKeys("Y$6q6+HNx#DasbX"); //Clave de ingreso 
            
            driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/form/div[3]/div[1]/button[1]")).click();;
            
            driver.findElement(By.id("input-pin")).sendKeys("9785"); //Pin de acceso
            Thread.sleep(60000);
            driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/form/div[2]/button")).click();
            
            driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div[1]/a")).click();
            
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div[2]/table/tbody/tr[4]/td/a")).click();
            
            driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div/a[2]")).click();
            
            driver.findElement(By.id("input-name")).sendKeys("Proyecto Pruebas");
            
            new Select(driver.findElement(By.id("input-category"))).selectByVisibleText("Tech & Gadgets");
            
            driver.findElement(By.id("input-date-launch")).sendKeys("2022-01-11");
            
            driver.findElement(By.id("input-link")).sendKeys("https://www.pruebasseleniumg7.com"); //WEB DE PRUEBA NO EXISTE SOLO PARA LLENAR EL CAMPO
            
            driver.findElement(By.cssSelector("#account-showcase > div > div > div.col-md-9 > form > div > button")).click();
            
            driver.findElement(By.cssSelector("#collapse-menu > div:nth-child(1) > div")).click();
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ChromeTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        } catch (Exception ex) {
            System.out.println("Ocurrió un error durante la ejecución: " + ex);
        }

        
          //Codigo Jose 
        
//        System.setProperty("webdriver.chrome.driver",
//                "D:\\Users\\Fran\\Escritorio\\G7-SC405\\chromedriver.exe");
//        System.out.println("Test Initiated");
//        driver = new ChromeDriver();
//        driver.get("https://phptravels.org/login");
//        System.out.println("Se introduce la informacion de acceso" + driver.getTitle());
//        driver.findElement(By.id("inputEmail"));
//        WebElement username = driver.findElement(By.id("inputEmail"));
//        driver.findElement(By.id("inputPassword"));
//        WebElement password = driver.findElement(By.id("inputPassword"));
//        username.sendKeys("solorzano@gmail.com");
//        password.sendKeys("Caiman!");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(ChromeTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.id("google-recaptcha-domainchecker1"))).click();
        
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("login"))).click();
        //driver.quit();
    }
}
