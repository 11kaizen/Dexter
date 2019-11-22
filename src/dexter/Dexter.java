/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dexter;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author ok
 */
public class Dexter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException, InterruptedException {
        // TODO code application logic here
        
//        creating an instance of the robot class
//        adding a throw clause to catch any unnecessary errors
        
        Robot r = new Robot();
//        this is for pressing and releasing the mouse(right)button        
//        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        
//      function for pressing the letters
//          r.keyPress(KeyEvent.VK_N);
//          r.keyRelease(KeyEvent.VK_N);
//          r.keyPress(KeyEvent.VK_A);
//          r.keyRelease(KeyEvent.VK_A);
//          r.keyPress(KeyEvent.VK_O);
//          r.keyRelease(KeyEvent.VK_O);
//          r.keyPress(KeyEvent.VK_M);
//          r.keyRelease(KeyEvent.VK_M);
//          r.keyPress(KeyEvent.VK_I);
//          r.keyRelease(KeyEvent.VK_I);  
        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
        

        
        
//  Gets pointer location
//      PointerInfo a = MouseInfo.getPointerInfo();
//      System.out.println(a.getLocation().getX());
//      System.out.println(a.getLocation().getY());
      
//      r.mouseMove(747, 537);
//      r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//      r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        
         r.keyPress(KeyEvent.VK_WINDOWS);
         r.keyPress(KeyEvent.VK_6);
         r.keyRelease(KeyEvent.VK_WINDOWS);
         r.keyRelease(KeyEvent.VK_6);
         //   Delay for five sec before the code runs
         Thread.sleep(4000);
         r.keyPress(KeyEvent.VK_TAB);
         r.keyRelease(KeyEvent.VK_TAB);
         r.keyPress(KeyEvent.VK_TAB);
         r.keyRelease(KeyEvent.VK_TAB);
         
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        
        
        r.keyPress(KeyEvent.VK_TAB);
         r.keyRelease(KeyEvent.VK_TAB);
         
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        
        r.keyPress(KeyEvent.VK_TAB);
         r.keyRelease(KeyEvent.VK_TAB);
         
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        
//        r.keyPress(KeyEvent.VK_TAB);
//         r.keyRelease(KeyEvent.VK_TAB);
//         
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyPress(KeyEvent.VK_TAB);
//         r.keyRelease(KeyEvent.VK_TAB);
//         
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        r.keyPress(KeyEvent.VK_TAB);
//         r.keyRelease(KeyEvent.VK_TAB);
//         
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
        
        r.keyPress(KeyEvent.VK_TAB);
         r.keyRelease(KeyEvent.VK_TAB);
         
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
      // something
      
        
    }
    
}
