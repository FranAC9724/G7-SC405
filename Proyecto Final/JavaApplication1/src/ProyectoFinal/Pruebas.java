/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.firefox.FirefoxDriver.*;

/**
 *
 * @author Fran
 */
public class Pruebas {

    String driverPath = "D:\\Users\\Fran\\Escritorio\\G7-SC405_VFinal\\Proyecto Final\\JavaApplication1\\chromedriver.exe";
    String url = "https://www.mopt.go.cr/";

    static WebDriver driver;

    public Pruebas() {

    }

    public void Prueba1() {
        try{
        
        }catch(Exception ex){
        
        }
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[1]/nav/ul/li[9]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[1]/nav/ul/li[9]/ul/li[1]/a")).click();

        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id=\"j_idt7:txtCedula\"]"))));
        driver.findElement(By.xpath("//*[@id=\"j_idt7:txtCedula\"]")).sendKeys("123456789");//Pin de acceso

    }

    public void Prueba2() {
        //Prueba 4
        try {
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.findElement(By.xpath("/html/body/div[1]/footer/div/div/div[1]/div[2]/div[2]/ul/li[3]/a")).click();
            Thread.sleep(6000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div/div/section/div[2]/ul/li/ul/li[3]/ul/li[7]/a")).click();

        } catch (Exception ex) {
            System.err.println("Ocurrió un error durante la ejecución: " + ex);
        }

    }

    public void Prueba3() {
        //Prueba 5
        System.out.println("Prueba 3");

        try {
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[1]/nav/ul/li[7]/a")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div/div/section/div[2]/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td[2]")).click();
            Thread.sleep(2000);

        } catch (Exception ex) {
            System.out.println("Ocurrió un error durante la ejecución: " + ex);
        }

    }

    public void Prueba4() {
        //Prueba 7
        System.out.println("Prueba 4");
        String url1 = "https://sig.mopt.go.cr:8084/web/index.html#8/9.850/-83.463";
        System.setProperty("webdriver.chrome.driver", driverPath);
        try {
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[1]/nav/ul/li[3]")).click();;
            driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[1]/nav/ul/li[3]/ul/li[4]/a")).click();
            driver.get(url1);

        } catch (Exception ex) {
            System.out.println("Ocurrió un error durante la ejecución: " + ex);
        }
    }

}
