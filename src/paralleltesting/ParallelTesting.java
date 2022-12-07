/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paralleltesting;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.firefox.FirefoxDriver.*;
import org.openqa.selenium.chrome.ChromeDriver.*;

/**
 *
 * @author joses
 */

public class ParallelTesting {

    public static void main(String[] args) {
        ChromeTest chrome = new ChromeTest();
        MozzilaTest mozzila = new MozzilaTest();
        ChromeTest1 c1=new ChromeTest1();
        mozzila.start();
        c1.start();
    }

}
