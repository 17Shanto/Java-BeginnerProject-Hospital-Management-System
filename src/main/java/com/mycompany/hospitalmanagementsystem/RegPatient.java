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

public class RegPatient extends JFrame{
    public String name, phone, age, gender, disease, docName;
    private Container c;
    private JLabel hed,Lname, Lphone, Lage, Lgender, Ldisease, LdocName;
    private JTextField Fname, Fphone, Fage, Fgender, Fdisease, FdocName;
    private Font f,f1,f3;
    private JButton Sub;
    private Cursor cursor;
    RegPatient()
    {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,50,650,650);
        setTitle("RegPatient");
    }
    
    
    public void initComponents()
    {
        
        
        
        //Font for JLabel and JTextField
        
        f = new Font("Times new Roman",Font.BOLD,20);
        Font  ff = new Font("Times new Roman",Font.BOLD,25); 
        f3 = new Font("Times new Roman",Font.PLAIN,20);
        f1 = new Font("Times new Roman",Font.PLAIN,20);
        
        //JLabel for Registration
        
        hed = new JLabel("Patient Registration Form");
        Lname = new JLabel("Name");
        Lphone = new JLabel("Phone Number");
        Lage = new JLabel("Age");
        Lgender  =new JLabel("Gender");
        Ldisease = new JLabel("Disease");
        LdocName = new JLabel("Doctor Name");
        
        //JTextField
        Fname = new JTextField();
        Fphone = new JTextField();
        Fage= new JTextField();
        Fgender= new JTextField();
        Fdisease= new JTextField();
        FdocName= new JTextField();
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);
        
        //Bounds, Font, Color
        
        hed.setBounds(180, 1,500, 50);
        hed.setFont(ff);
        hed.setForeground(Color.green);
        
        Lname.setBounds(1, 220,300, 50);
        Lname.setFont(f);
        Lname.setForeground(Color.black);
        
        Lphone.setBounds(1, 265,300, 50);
        Lphone.setFont(f);
        Lphone.setForeground(Color.black);
        
        
        Lage.setBounds(1, 310,300, 50);
        Lage.setFont(f);
        Lage.setForeground(Color.black);
        
        Lgender.setBounds(1, 355,300, 50);
        Lgender.setFont(f);
        Lgender.setForeground(Color.black);
        
        Ldisease.setBounds(1, 400,300, 50);
        Ldisease.setFont(f);
        Ldisease.setForeground(Color.red);
        
        LdocName.setBounds(1, 445,300, 50);
        LdocName.setFont(f);
        LdocName.setForeground(Color.black);
        
        Fname.setBounds(155,230,300,40);
        Fname.setFont(f3);
        Fname.setForeground(Color.BLACK);
        Fname.setOpaque(true);
        Fname.setBackground(Color.white);
        
        Fphone.setBounds(155,275,300, 40);
        Fphone.setFont(f3);
        Fphone.setForeground(Color.BLACK);
        Fphone.setOpaque(true);
        Fphone.setBackground(Color.white);
        
        Fage.setBounds(155,320,300, 40);
        Fage.setFont(f3);
        Fage.setForeground(Color.BLACK);
        Fage.setOpaque(true);
        Fage.setBackground(Color.white);
        
        Fgender.setBounds(155,365,300, 40);
        Fgender.setFont(f3);
        Fgender.setForeground(Color.BLACK);
        Fgender.setOpaque(true);
        Fgender.setBackground(Color.white);
        
        Fdisease.setBounds(155,410,300, 40);
        Fdisease.setFont(f3);
        Fdisease.setForeground(Color.BLACK);
        Fdisease.setOpaque(true);
        Fdisease.setBackground(Color.white);
        
        FdocName.setBounds(155,455,300, 40);
        FdocName.setFont(f3);
        FdocName.setForeground(Color.BLACK);
        FdocName.setOpaque(true);
        FdocName.setBackground(Color.white);
        
        Sub = new JButton("Submit");
        cursor = new Cursor(Cursor.HAND_CURSOR);
        Sub.setFont(f);
        Sub.setCursor(cursor);
        Sub.setBounds(220, 520,120, 40);
        Sub.setBackground(Color.GREEN);
        
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
		logoIcon.setBounds(170,40,275,176);
		c.add(logoIcon);
       
        
        c.add(hed);
        c.add(Lname);
        c.add(Lphone);
        c.add(Lage);
        c.add(Lgender);
        c.add(Ldisease);
        c.add(LdocName);
        
        c.add(Fname);
        c.add(Fphone);
        c.add(Fage);
        c.add(Fgender);
        c.add(Fdisease);
        c.add(FdocName);
        
        c.add(Sub);
        
        
        Sub.addActionListener(new ActionListener(){
        
         
          public void actionPerformed(ActionEvent e)
          {
              
              String n = Fname.getText();
              String a = Fage.getText();
              String p = Fphone.getText();
              String g = Fgender.getText();
              String di = Fdisease.getText();
              String doc = FdocName.getText();
              
              Registration_Patient Ex = new Registration_Patient();
               Ex.saveFile(n, p, a, g,di,doc);
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
