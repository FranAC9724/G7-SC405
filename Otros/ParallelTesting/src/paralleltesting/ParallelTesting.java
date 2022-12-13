/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paralleltesting;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
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
       // MozzilaTest mozzila = new MozzilaTest();
        //mozzila.start();
        chrome.start();
        try{
            int menu;
            //se crea la condicional del menu
            do{
                menu = Integer.parseInt(JOptionPane.showInputDialog("Por favor, escoja una opcion:" + 
                          "\n1 - Caso 1"
                        + "\n2 - Caso 2"
                        + "\n3 - Caso 3"
                        + "\n4 - Caso 4"
                        + "\n5 - Salir"));
                
                switch (menu){
                    //se crean los casos correspondientes al menu
                    case 1:
                        ChromeTest objChrome = new ChromeTest();
                        objChrome.caso1();
                        break;
                    case 2:
                        ChromeTest objChrome2 = new ChromeTest();
                        objChrome2.caso2();
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        System.exit(0);
                }
            }while(menu !=9);
            //se cierra el try and catch
        }catch(HeadlessException | NumberFormatException e){
            
        }
    }

}
