
package com.mycompany.hospitalmanagementsystem;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JOptionPane;
public class RegBlood extends JFrame {
    
    public String blood,age,phone;
    public static String name;
    private Container c;
    private JLabel  Lname,Lblood,Lage,Lphone,hed;
    private JTextField Fname, Fblood,Fage,Fphone;
    private Font f,f1,f3;
    private JButton Sub;
    private Cursor cursor;
    RegBlood()
    {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,50,600,650);
        setTitle("Text Field Demo");
    }
    public void initComponents()
    {
        f = new Font("Times new Roman",Font.BOLD,20);
        f1 = new Font("Times new Roman",Font.BOLD,30);
        f3 = new Font("Times new Roman",Font.PLAIN,20);
        Lname = new JLabel("Name");
        Lblood = new JLabel("Blood Group");
        Lage = new JLabel("Age");
        Lphone = new JLabel("Phone Number");
        hed = new JLabel("Blood Donar Registration Form");
        
        Fname = new JTextField();
        Fblood = new JTextField();
        Fage = new JTextField();
        Fphone = new JTextField();
        
        Sub = new JButton("Submit");
        cursor = new Cursor(Cursor.HAND_CURSOR);
        Sub.setFont(f);
        Sub.setCursor(cursor);
        Sub.setBounds(230, 500,120, 40);
        Sub.setBackground(Color.GREEN);
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);
        hed.setBounds(80, 40,500, 50);
        hed.setFont(f1);
        hed.setForeground(Color.green);
        Lname.setBounds(1, 320,300, 50);
        Lname.setFont(f);
        Lname.setForeground(Color.black);
        Lblood.setBounds(1,365,300,50);
        Lblood.setFont(f);
        Lblood.setForeground(Color.red);
       
        Lage.setBounds(1, 410,300, 50);
        Lage.setFont(f);
        Lage.setForeground(Color.green);
        Lphone.setBounds(1,455,300,50);
        Lphone.setFont(f);
        Lphone.setForeground(Color.black);
        
        Fname.setBounds(145,320,300,40);
        Fname.setFont(f3);
        Fname.setForeground(Color.BLACK);
        Fname.setOpaque(true);
        Fname.setBackground(Color.white);
        Fblood.setBounds(145,365,300,40);
        Fblood.setFont(f3);
        Fblood.setForeground(Color.BLACK);
        Fblood.setOpaque(true);
        Fblood.setBackground(Color.white);
        Fage.setBounds(145,410,300,40);
        Fage.setFont(f3);
        Fage.setForeground(Color.BLACK);
        Fage.setOpaque(true);
        Fage.setBackground(Color.white);
        Fphone.setBounds(145,455,300,40);
        Fphone.setFont(f3);
        Fphone.setForeground(Color.BLACK);
        Fphone.setOpaque(true);
        Fphone.setBackground(Color.white);
        
        
        Font  fx = new Font("Times new Roman",Font.BOLD,18);        
        JButton back = new JButton("Back");        
        back.setFont(fx);
        back.setCursor(cursor);
        back.setBounds(10, 560,78, 40);
        back.setBackground(Color.white);
        back.setOpaque(true);
        back.setForeground(Color.red);
        c.add(back);
        
        JButton exit = new JButton("Exit"); 
        exit.setBounds(460, 560,78, 40);
        exit.setFont(fx);
        exit.setCursor(cursor);
        exit.setBackground(Color.WHITE);
        exit.setOpaque(true);
        exit.setForeground(Color.red);
        c.add(exit);
        
         ImageIcon logo = new ImageIcon(getClass().getResource("logo.jpg"));
		JLabel logoIcon = new JLabel(logo);
		logoIcon.setBounds(160,90,275,176);
		c.add(logoIcon);
        
        c.add(hed);
        c.add(Lname);
        c.add(Fname);
        c.add(Lblood);
        c.add(Fblood);
        c.add(Lage);
        c.add(Fage);
        c.add(Lphone);
        c.add(Fphone);
        c.add(Sub);
        
        Sub.addActionListener(new ActionListener(){
        
         
          public void actionPerformed(ActionEvent e)
          {
              
              String n = Fname.getText();
              String b= Fblood.getText();
              String a = Fage.getText();
              String p = Fphone.getText();
              Registration_Blood_Donor Ex = new Registration_Blood_Donor();
              Ex.saveFile(n, b, a, p);
               JOptionPane.showMessageDialog(null,"Registration Sucessfully Completed");
               dispose();
                FrontPage fa = new FrontPage();
                fa.setVisible(true);
          }
      });
        
        back.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
               
             FrontPage fa = new FrontPage();
             fa.setVisible(true);
              dispose();
              
          }
          
          
      });
        
        exit.addActionListener(new ActionListener(){
        
         
          public void actionPerformed(ActionEvent e)
          {
              JOptionPane.showMessageDialog(null,"Thank You\nFor visiting our site");
               dispose();
                
          }
      });
        
  
        
    }

    
}

