
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
public class RegDoctor extends JFrame {
    
    public String name, specialty,Time,room,userName,Password;
    private JLabel hed,Lname, Lspecialty, LTime,Lroom,LuserName,LPassword;
    private JTextField Fname, Fspecialty,FTime,Froom,FuserName,FPassword;
    private Container c;
    private Font f,f1,f3;
    private JButton Sub;
    private Cursor cursor;
    
    RegDoctor()
    {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,50,600,700);
        setTitle("RegDoctor");
    }
    
    public void initComponents()
    {
        f = new Font("Times new Roman",Font.BOLD,20);
        f1 = new Font("Times new Roman",Font.BOLD,30);
        f3 = new Font("Times new Roman",Font.PLAIN,20);
        
        //JLabel for Registration
        
        
        //hed = new JLabel("Doctor Registration Form");
        Lname = new JLabel("Name");
        Lspecialty = new JLabel("Specialty");
        LTime = new JLabel("Time");
        Lroom  =new JLabel("Room No");
        LuserName= new JLabel("User Name");
        LPassword = new JLabel("Password");
        
        Fname = new JTextField();
        Fspecialty = new JTextField();
        FTime= new JTextField();
        Froom= new JTextField();
        FuserName= new JTextField();
        FPassword= new JTextField();
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
        
      
        
        Lname.setBounds(10, 220,300, 50);
        Lname.setFont(f);
        Lname.setForeground(Color.black);
        
     
        Lspecialty.setBounds(10, 265,300, 50);
        Lspecialty.setFont(f);
        Lspecialty.setForeground(Color.black);
        
        LTime.setBounds(10, 310,300, 50);
        LTime.setFont(f);
        LTime.setForeground(Color.black);
        
        Lroom.setBounds(10, 355,300, 50);
        Lroom.setFont(f);
        Lroom.setForeground(Color.black);
        
        LuserName.setBounds(10, 400,300, 50);
        LuserName.setFont(f);
        LuserName.setForeground(Color.black);
        
        LPassword.setBounds(10, 445,300, 50);
        LPassword.setFont(f);
        LPassword.setForeground(Color.red);
        
        Fname.setBounds(145,225,250,40);
        Fname.setFont(f3);
        Fname.setForeground(Color.BLACK);
        Fname.setOpaque(true);
        Fname.setBackground(Color.white);
        
        Fspecialty.setBounds(145,270,250, 40);
        Fspecialty.setFont(f3);
        Fspecialty.setForeground(Color.BLACK);
        Fspecialty.setOpaque(true);
        Fspecialty.setBackground(Color.white);
        
        FTime.setBounds(145,315,250, 40);
        FTime.setFont(f3);
        FTime.setForeground(Color.BLACK);
        FTime.setOpaque(true);
        FTime.setBackground(Color.white);
        
         Froom.setBounds(145,360,250, 40);
         Froom.setFont(f3);
         Froom.setForeground(Color.BLACK);
         Froom.setOpaque(true);
         Froom.setBackground(Color.white);
        
        FuserName.setBounds(145,405,250, 40);
        FuserName.setFont(f3);
        FuserName.setForeground(Color.BLACK);
        FuserName.setOpaque(true);
        FuserName.setBackground(Color.white);
        
         FPassword.setBounds(145,450,250, 40);
         FPassword.setFont(f3);
         FPassword.setForeground(Color.BLACK);
         FPassword.setOpaque(true);
         FPassword.setBackground(Color.white);
         
        Sub = new JButton("Sign Up");
        cursor = new Cursor(Cursor.HAND_CURSOR);
        Sub.setFont(f1);
        Sub.setCursor(cursor);
        Sub.setBounds(170, 550,200, 50);
        Sub.setBackground(Color.GREEN);
        
        ImageIcon logo = new ImageIcon(getClass().getResource("logo.jpg"));
		JLabel logoIcon = new JLabel(logo);
		logoIcon.setBounds(140,30,275,176);
		c.add(logoIcon);
        Font  ff = new Font("Times new Roman",Font.BOLD,18);        
        JButton back = new JButton("Back");        
        back.setFont(ff);
        back.setCursor(cursor);
        back.setBounds(10, 560,78, 40);
        back.setBackground(Color.white);
        back.setOpaque(true);
        back.setForeground(Color.red);
        c.add(back);
        
        JButton exit = new JButton("Exit"); 
        exit.setBounds(460, 560,78, 40);
        exit.setFont(ff);
        exit.setCursor(cursor);
        exit.setBackground(Color.WHITE);
        exit.setOpaque(true);
        exit.setForeground(Color.red);
        c.add(exit);
        
        
        
        c.add(Lname);
        c.add(Lspecialty);
        c.add(LTime);
        c.add(Lroom);
        c.add(LuserName);
        c.add(LPassword);
        
      //  c.add(hed);
        c.add(Fname);
        c.add(Fspecialty);
        c.add(FTime);
        c.add(Froom);
        c.add(FuserName);
        c.add(FPassword);
        
        c.add(Sub);
        
        
        back.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
               
              
             FrontPageDoc fa = new FrontPageDoc();
               fa.setVisible(true);
               dispose();
              
          }
          
          
      });
        
        exit.addActionListener(new ActionListener(){
        
         
          public void actionPerformed(ActionEvent e)
          {
              JOptionPane.showMessageDialog(null,"Thank You\nFor visiting our site");
               dispose();
                 FrontPage fa = new FrontPage();
                  fa.setVisible(true);
                
          }
      });
        
        
        Sub.addActionListener(new ActionListener(){
        
         
          public void actionPerformed(ActionEvent e)
          {
              
              String n = Fname.getText();
              String s = Fspecialty.getText();
              String t = FTime.getText();
              String r = Froom.getText();
              String us = FuserName.getText();
              String ps = FPassword.getText();
              
              Registration_Doctor Ex = new Registration_Doctor();
               Ex.saveFile(n, s, t, r,us,ps);
               JOptionPane.showMessageDialog(null,"Registration Sucessfully Completed");
               dispose();
              
          }
      });
           // Lspecialty, LTime,Lroom,LuserName,LPassword;
         
        
        
    }
    
}
