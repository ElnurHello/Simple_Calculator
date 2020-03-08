/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatordemo;

import java.awt.Color;

/**
 *
 * @author Elnur
 */
public class CalculatorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalClass c = new CalClass   ();
        c.getContentPane().setBackground(Color.cyan);
        c.setVisible(true);
        c.setLocation(300,300);
    }
    
}
