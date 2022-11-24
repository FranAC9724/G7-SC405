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

    @Override
    public void run() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\joses\\OneDrive\\Documentos\\Selenium\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Test Initiated");
        driver = new ChromeDriver();
        driver.get("https://phptravels.org/login");
        System.out.println("Se introduce la informacion de acceso" + driver.getTitle());
        driver.findElement(By.id("inputEmail"));
        WebElement username = driver.findElement(By.id("inputEmail"));
        driver.findElement(By.id("inputPassword"));
        WebElement password = driver.findElement(By.id("inputPassword"));
        username.sendKeys("solorzano@gmail.com");
        password.sendKeys("Caiman!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ChromeTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("google-recaptcha-domainchecker1"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login"))).click();
        //driver.quit();
    }
}
