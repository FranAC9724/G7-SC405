/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paralleltesting;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import static paralleltesting.ChromeTest.driver;

/**
 *
 * @author joses
 */
public class MozzilaTest extends Thread {

    static WebDriver driver;

    public MozzilaTest() {
    }

    
    @Override
    public void run(){
        System.setProperty("webdriver.firefox.driver", 
                "C:\\Users\\joses\\OneDrive\\Documentos\\Selenium\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
        System.out.println("Test Initiated");
        driver=new FirefoxDriver();
        driver.get("https://phptravels.org/login");
        System.out.println("Se introduce la informacion de acceso" + driver.getTitle());
        driver.findElement(By.id("inputEmail"));
        WebElement username = driver.findElement(By.id("inputEmail"));
        driver.findElement(By.id("inputPassword"));
        WebElement password = driver.findElement(By.id("inputPassword"));
        username.sendKeys("solorzano@gmail.com");
        password.sendKeys("Caiman!");
        driver.findElement(By.id("google-recaptcha-domainchecker1")).click();
        //driver.quit();
    }
}
