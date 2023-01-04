
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

public class DisplayDoc extends JFrame {
    
   public String name, specialty,Time,room,userName,Password;
    private JLabel hed,Lname, Lspecialty, LTime,Lroom,LuserName,LPassword;
    private Container c;
    private Font f,f1,f3;
    private JButton Sub;
    private Cursor cursor;
    
    DisplayDoc()
    {
        
    }
     DisplayDoc(String name, String specialty,String Time, String room)
    {
        initComponents(name,  specialty, Time,  room);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,50,700,650);
        setTitle("Patient Registration From");
    }
     public void initComponents(String name, String specialty,String Time, String room)
     {
         cursor = new Cursor(Cursor.HAND_CURSOR);
         f = new Font("Times new Roman",Font.BOLD,20);
        f1 = new Font("Times new Roman",Font.BOLD,30);
        f3 = new Font("Times new Roman",Font.PLAIN,20);
        
          Lname = new JLabel("Name: "+name);
        Lspecialty = new JLabel("Specialty: "+specialty);
        LTime = new JLabel("Time: "+Time);
        Lroom  =new JLabel("Room No: "+room);
         Lname.setBounds(10, 220,300, 50);
        Lname.setFont(f);
        Lname.setForeground(Color.black);
        
     
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);
        
        Lspecialty.setBounds(10, 265,300, 50);
        Lspecialty.setFont(f);
        Lspecialty.setForeground(Color.black);
        
        LTime.setBounds(10, 310,300, 50);
        LTime.setFont(f);
        LTime.setForeground(Color.black);
        
        Lroom.setBounds(10, 355,300, 50);
        Lroom.setFont(f);
        Lroom.setForeground(Color.black);
        
        
        ImageIcon logo = new ImageIcon(getClass().getResource("logo.jpg"));
		JLabel logoIcon = new JLabel(logo);
		logoIcon.setBounds(140,30,275,176);
		c.add(logoIcon);
        Font  ff = new Font("Times new Roman",Font.BOLD,18);        
        JButton back = new JButton("Logout");        
        back.setFont(ff);
        back.setCursor(cursor);
        back.setBounds(560, 560,120, 40);
        back.setBackground(Color.white);
        back.setOpaque(true);
        back.setForeground(Color.red);
        c.add(back);
        
        
        
        JButton Display = new JButton("Your Patients List");
        Display.setBounds(210, 360,278, 40);
        Display.setFont(ff);
        Display.setCursor(cursor);
        Display.setBackground(Color.WHITE);
        Display.setOpaque(true);
        Display.setForeground(Color.green);
        Display.setCursor(cursor);
        c.add(Display);
        
        JButton Blood = new JButton("Search Blood Donor ");
        Blood.setBounds(210, 520,278, 40);
        Blood.setFont(ff);
        Blood.setCursor(cursor);
        Blood.setBackground(Color.WHITE);
        Blood.setOpaque(true);
        Blood.setForeground(Color.green);
        Blood.setCursor(cursor);
        c.add(Blood);
        
         JLabel Grp  = new JLabel("Blood Group: ");
         Grp.setBounds(210, 460,278, 40);     
         Grp.setFont(f);
         Grp.setForeground(Color.red);
           c.add(Grp);
         
         JTextField AB = new JTextField();
         AB.setBounds(330, 460,70,40);
        AB.setFont(f3);
        AB.setForeground(Color.red);
        AB.setOpaque(true);
        AB.setBackground(Color.white);
         
        c.add(AB);
        
        
        c.add(Lname);
        c.add(Lspecialty);
        c.add(LTime);
        c.add(Lroom);
        
        back.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
               
              
             FrontPageDoc fa = new FrontPageDoc();
               fa.setVisible(true);
               dispose();
              
          }
          
          
      });
        
        Display.addActionListener(new ActionListener(){
        
         
          public void actionPerformed(ActionEvent e)
          {
              
              Registration_Patient ob = new Registration_Patient();
             ArrayList<Registration_Patient> Info = new ArrayList<Registration_Patient>();
             ArrayList<Registration_Patient> Fin = new ArrayList<Registration_Patient>();
              Info = ob.ReadFile();
              ListIterator li  = null;
              li = Info.listIterator();
              boolean found = true;
              String docName = name ;
              int sz = 0;
              while(li.hasNext())
                         {
                             Registration_Patient dx = (Registration_Patient)li.next();
                             if(name.equals(dx.docName))
                             {
                                 found  = false;
                                 Fin.add(new Registration_Patient (dx.name,dx.phoneNumber,dx.age,dx.gender,dx.disease,dx.docName));
                                 sz++;
                             }
                             
                             
                         }
              
              
              //sz = Fin.size();
              
              if(found)
              {
                  JOptionPane.showMessageDialog(null,"Sorry Today You have no Patient",
                  "Something Wrong", JOptionPane.WARNING_MESSAGE);
                   dispose();
              }
              else
              {
                  DisplayPatient tx = new DisplayPatient(sz,Fin);
                  tx.setVisible(true);
                  dispose();
                  
              }
                  
                
          }
      });
        
        
        back.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
               
              
             FrontPageDoc fa = new FrontPageDoc();
               fa.setVisible(true);
               dispose();
              
          }
          
          
      });
        
         Blood.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
               
              String x = AB.getText();
              Registration_Blood_Donor Ex = new Registration_Blood_Donor();
             ArrayList<Registration_Blood_Donor> Info = new ArrayList<Registration_Blood_Donor>();
             ArrayList<Registration_Blood_Donor> Fin = new ArrayList<Registration_Blood_Donor>();
              Info = Ex.ReadFile();
              ListIterator li  = null;
              li = Info.listIterator();
              boolean found = true;
              String docName = name ;
              int sz = 0;
              while(li.hasNext())
                         {
                             Registration_Blood_Donor dx = (Registration_Blood_Donor)li.next();
                             if(x.equals(dx.bloodGroup))
                             {
                                 found  = false;
                                 Fin.add(new Registration_Blood_Donor (dx.name,dx.bloodGroup,dx.phoneNumber,dx.age));
                                 sz++;
                             }
                             
                             
                         }
              
              
              //sz = Fin.size();
              
              if(found)
              {
                  JOptionPane.showMessageDialog(null,"No Blood Donor Available",
                  "Something Wrong", JOptionPane.WARNING_MESSAGE);
                   dispose();
              }
              else
              {
                  DisplayDonor tx = new DisplayDonor(sz,Fin);
                  tx.setVisible(true);
                  dispose();
                  
              }
              
          }
          
          
      });
        
        
        
       
     }
     
     
    
}
