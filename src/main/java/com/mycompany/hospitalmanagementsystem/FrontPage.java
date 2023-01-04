
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

public class FrontPage extends JFrame {
    
     private JButton doctor,donor,patient,exit;
   
   
     private Cursor cursor;
     private Container c;
     private Font f,f1,f3;
     
     FrontPage()
    {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,50,700,650);
        setTitle("FrontPage");
    }
     public void initComponents()
     {
         f = new Font("Times new Roman",Font.BOLD,40);
        f1 = new Font("Times new Roman",Font.BOLD,30);
        f3 = new Font("Times new Roman",Font.CENTER_BASELINE,20);
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);
        
        
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        doctor = new JButton("Doctor");
        patient = new JButton("Patient");
        donor = new JButton("Donor");
        exit= new JButton("Exit");
        
        doctor.setBounds(225, 280,200, 50);
        doctor.setFont(f);
        doctor.setCursor(cursor);
        doctor.setBackground(Color.GREEN);
        
        patient.setBounds(225,340,200,50);
        patient.setFont(f1);
        patient.setCursor(cursor);
        patient.setBackground(Color.cyan);
       
        donor.setBounds(225, 400,200, 50);
        donor.setFont(f1);
        donor.setCursor(cursor);
        donor.setBackground(Color.red);
        
        exit.setBounds(10, 565,100, 40);
        exit.setFont(f3);
        exit.setCursor(cursor);
        exit.setBackground(Color.WHITE);
         exit.setOpaque(true);
        exit.setForeground(Color.red);
        
        
        ImageIcon logo = new ImageIcon(getClass().getResource("logo.jpg"));
		JLabel logoIcon = new JLabel(logo);
		logoIcon.setBounds(180,50,275,176);
		c.add(logoIcon);
     
        c.add(doctor);
        c.add(patient);
        c.add(donor);
        c.add(exit);
        
        
        doctor.addActionListener(new ActionListener(){
        
         
          public void actionPerformed(ActionEvent e)
          {
             
              FrontPageDoc pd = new FrontPageDoc();
              pd.setVisible(true);
              dispose();
              
          }
      });
        
        
         patient.addActionListener(new ActionListener(){
        
         
          public void actionPerformed(ActionEvent e)
          {
             
                RegPatient frame = new RegPatient();
                 frame.setVisible(true);
                 dispose();
          }
      });
        
        donor.addActionListener(new ActionListener(){
        
         
          public void actionPerformed(ActionEvent e)
          {
             
                RegBlood frame = new RegBlood();
                 frame.setVisible(true);
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
