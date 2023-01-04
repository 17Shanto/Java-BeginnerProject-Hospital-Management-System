/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class DisplayDonor extends JFrame {
    
     public String name, phone, age, group;
      private Container c;
     
    
    private Font f,f1,f3;
    private JButton Sub;
    private Cursor cursor;
    
    DisplayDonor(int x, ArrayList<Registration_Blood_Donor> Fin)
    {
        int sz = x/2;
        if(sz==0)
        {
            sz=1;
        }
            
        initComponents(Fin);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,50,700,650*x);
        setTitle("Display Patient Information");
    }
    
    public void initComponents(ArrayList<Registration_Blood_Donor> Fin)
    {
        int cnt = 1;
        f = new Font("Times new Roman",Font.BOLD,20);
        f1 = new Font("Times new Roman",Font.BOLD,30);
        f3 = new Font("Times new Roman",Font.PLAIN,20);
        
         
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);
         ImageIcon logo = new ImageIcon(getClass().getResource("logo.jpg"));
		JLabel logoIcon = new JLabel(logo);
		logoIcon.setBounds(140,30,275,176);
		c.add(logoIcon);
        int space = 0,upperSpace=0;
        ListIterator li  = null;
         li = Fin.listIterator();
         while(li.hasNext())
                         {
                             Registration_Blood_Donor dx = (Registration_Blood_Donor)li.next();
      
        JLabel Lname = new JLabel("Donor No  "+cnt+ ". Name: "+dx.name);
        JLabel Lblood = new JLabel("Blood Group: "+dx.bloodGroup);
       JLabel Lage = new JLabel("Age: "+dx.age);
       JLabel Lphone  =new JLabel("Phone Number: "+dx.phoneNumber);
                       
                             
        Lname.setBounds(10, 265+space,400, 50);
        Lname.setFont(f);
        Lname.setForeground(Color.black);
        
        Lblood.setBounds(10, 295+space,400, 50);
        Lblood.setFont(f);
        Lblood.setForeground(Color.red);
        
        Lage.setBounds(10, 325+space,400, 50);
        Lage.setFont(f);
        Lage.setForeground(Color.black);
        
        Lphone.setBounds(10, 355+space,400, 50);
        Lphone.setFont(f);
        Lphone.setForeground(Color.black);
        
        
       
        
        
        
        c.add(Lname);
        c.add(Lphone);
        c.add(Lage);
        c.add(Lblood);
      
        space+=180;
        upperSpace+=20;
        cnt++;
                             
          
                             
                         }
        
        
        
    }
    
}
