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

public class DisplayPatient extends JFrame{
    
    
   public String name, phone, age, gender, disease, docName;
    private Container c;
    private JLabel hed,Lname, Lphone, Lage, Lgender, Ldisease, LdocName;
    
    private Font f,f1,f3;
    private JButton Sub;
    private Cursor cursor;
    
    DisplayPatient(int x, ArrayList<Registration_Patient> Fin)
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
    
    public void initComponents(ArrayList<Registration_Patient> Fin)
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
                             Registration_Patient dx = (Registration_Patient)li.next();
      
        Lname = new JLabel("Patient No  "+cnt+ ". Name: "+dx.name);
        Lphone = new JLabel("Phone Number: "+dx.phoneNumber);
        Lage = new JLabel("Age: "+dx.age);
        Lgender  =new JLabel("Gender: "+dx.gender);
        Ldisease = new JLabel("Disease: "+dx.disease);                    
                             
        Lname.setBounds(10, 265+space,400, 50);
        Lname.setFont(f);
        Lname.setForeground(Color.black);
        
        Lphone.setBounds(10, 295+space,400, 50);
        Lphone.setFont(f);
        Lphone.setForeground(Color.black);
        
        
        Lage.setBounds(10, 325+space,400, 50);
        Lage.setFont(f);
        Lage.setForeground(Color.black);
        
        Lgender.setBounds(10, 355+space,400, 50);
        Lgender.setFont(f);
        Lgender.setForeground(Color.green);
        
        Ldisease.setBounds(10, 385+space,400, 50);
        Ldisease.setFont(f);
        Ldisease.setForeground(Color.red);
        
        c.add(Lname);
        c.add(Lphone);
        c.add(Lage);
        c.add(Lgender);
        c.add(Ldisease);
        space+=180;
        upperSpace+=20;
        cnt++;
                             
          
                             
                         }
        
      
        
        
        
        
    }
    
}
