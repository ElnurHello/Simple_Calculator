/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatordemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Color;

/**
 *
 * @author Elnur
 */
public class CalClass extends JFrame implements ActionListener{
    JFrame f = new JFrame();
    
    JLabel l1 ,  l2, l3;
    TextField t1, t2 ,t3;
    Button b1,b2,b3,b4,b5,b6;
    public boolean sign;
    public CalClass()
    {
        l1 = new JLabel("Number1");
        t1 = new TextField(10);
        t1.setBackground(Color.white);
       
        l2 = new JLabel("Number2");
        t2 = new TextField(10);
        t2.setBackground(Color.white);
        
        l3 = new JLabel("Result");
        t3 = new TextField(10);
        t3.setBackground(Color.white);
       
        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Multi");
        b4 = new Button("Div");
        b5 = new Button("Reset");
        b6 = new Button("Close");
     
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        setSize(500,500);
        setTitle("Calculator");
        setLayout(new FlowLayout());
       
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        double  a = 0,b=0,c=0;
        
        try
        {
            a = Double.parseDouble(t1.getText());
        
        }
        catch(NumberFormatException e)
        {
            sign = true;
            t1.setText("Invalid Input");
           
        }
        
        try
        {
            b = Double.parseDouble(t2.getText());
        
        }
        catch(NumberFormatException e)
        {
            sign = true;
            t2.setText("Invalid Input");
            
        }
        if(ae.getSource()==b1)
        {
            c = a+b;
            t3.setText(String.valueOf(c));
            if(sign == true)
            {
                t3.setText("Sikdir");
                sign = false;
            }
        }
        if(ae.getSource()==b2)
        {
            c = a-b;
            t3.setText(String.valueOf(c));
            if(sign == true)
            {
                t3.setText("Sikdir");
                sign = false;
            }
        }
        if(ae.getSource()==b3)
        {
            c = a*b;
            t3.setText(String.valueOf(c));
            if(sign == true)
            {
                t3.setText("Sikdir");
                sign = false;
            }
        }
        if(ae.getSource()==b4)
        {
            c = a/b;
            t3.setText(String.valueOf(c));
            if(sign == true)
            {
                t3.setText("Sikdir");
                sign = false;
            }
        }
        if(ae.getSource()==b5)
        {
            t1.setText("0");
            t2.setText("0");
            t3.setText("0");
        }
        if(ae.getSource() == b6)
        {
            System.exit(0);
        }
     }
    
}
