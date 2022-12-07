
package paralleltesting;

import java.time.Duration;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import static paralleltesting.ChromeTest1.driver;

/**
 *
 * @author joses
 */
public class MozzilaTest extends Thread {

    static WebDriver driver;

    public MozzilaTest() {
    }

    
 
    @SuppressWarnings("empty-statement")
    @Override
    public void run(){
        String driverPath = "C:\\Users\\joses\\OneDrive\\Documentos\\Selenium\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe";
        String url = "https://www.opencart.com/index.php?route=account/login";
        System.setProperty("webdriver.firefox.driver", driverPath);

        System.out.println("Test Initiated");

        try {
            driver = new FirefoxDriver();
            driver.get(url);
            driver.manage().window().maximize();

            driver.findElement(By.id("input-email")).sendKeys("iaraya20562@ufide.ac.cr"); //Usuario Registrado

            driver.findElement(By.id("input-password")).sendKeys("Y$6q6+HNx#DasbX"); //Clave de ingreso 

            driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/form/div[3]/div[1]/button[1]")).click();;
//            Thread.sleep(7000);
            WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(25));
            
            WebElement element= new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id=\"input-pin\"]"))));
            driver.findElement(By.xpath("//*[@id=\"input-pin\"]")).sendKeys("9785");//Pin de acceso

            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/form/div[2]/button")).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath("//*[@id=\"short-cut\"]/div[5]/div[1]/div/div[2]/h4/a")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"account-store\"]/div[2]/div/div[1]/div[2]/a[2]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"input-domain\"]")).sendKeys("www.uno.com");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"account-edit\"]/div[2]/div/div[1]/form/div/button")).click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(ChromeTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        } catch (InterruptedException ex) {
            System.out.println("Ocurrió un error durante la ejecución: " + ex);
        }
    }
} 