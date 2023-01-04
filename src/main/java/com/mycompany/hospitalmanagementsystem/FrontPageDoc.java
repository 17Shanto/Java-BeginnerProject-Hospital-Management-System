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
public class FrontPageDoc extends JFrame{
    
    
    
    
     private JButton reg,log;
     private JLabel or,top;
     private Cursor cursor;
     private Container c;
     private Font f,f1,f3;
     
      FrontPageDoc()
    {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,50,550,570);
        setTitle("FrontPageDoc");
    }
      
      public void initComponents()
      {
         f = new Font("Times new Roman",Font.BOLD,20);
        Font  ff = new Font("Times new Roman",Font.BOLD,18); 
        f1 = new Font("Times new Roman",Font.HANGING_BASELINE,30);
        f3 = new Font("Times new Roman",Font.PLAIN,20);
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);
        
        reg= new JButton("Sign Up");
        log =  new JButton(" Login");
        top = new JLabel("Do you want to");
        or = new JLabel("Or");
        JLabel w = new JLabel("?");
        
    
       
        cursor = new Cursor(Cursor.HAND_CURSOR);
        reg.setFont(f);
        reg.setCursor(cursor);
        reg.setBounds(200, 300,110, 40);
        reg.setBackground(Color.white);
        reg.setOpaque(true);
        reg.setForeground(Color.green);
        
        log.setFont(f);
        log.setCursor(cursor);
        log.setBounds(200, 400,100, 40);
        log.setBackground(Color.white);
        log.setOpaque(true);
        log.setForeground(Color.blue);
        
        w.setFont(f1);
        w.setBounds(300, 400,100, 40);
        //w.setOpaque(true);
        //w.setForeground(Color.red);
        
       JButton back = new JButton("Back");
        back.setFont(ff);
        back.setCursor(cursor);
        back.setBounds(10, 460,78, 40);
        back.setBackground(Color.white);
        back.setOpaque(true);
        back.setForeground(Color.red);
        c.add(back);
        
         JButton exit = new JButton("Exit"); 
        exit.setBounds(420, 460,78, 40);
        exit.setFont(ff);
        exit.setCursor(cursor);
        exit.setBackground(Color.WHITE);
        exit.setOpaque(true);
        exit.setForeground(Color.red);
        c.add(exit);
        
        or.setFont(f1);
        or.setBounds(240, 350,110, 40);
        
        top.setFont(f1);
        top.setBounds(170, 240,300, 40);
         ImageIcon logo = new ImageIcon(getClass().getResource("logo.jpg"));
		JLabel logoIcon = new JLabel(logo);
		logoIcon.setBounds(125,40,275,176);
		c.add(logoIcon);
                
        
        /*Font  fx = new Font("Times new Roman",Font.BOLD,18); 
        JButton exit = new JButton("Exit"); 
        exit.setBounds(460, 560,78, 40);
        exit.setFont(fx);
        exit.setCursor(cursor);
        exit.setBackground(Color.WHITE);
        exit.setOpaque(true);
        exit.setForeground(Color.red);
        c.add(exit);*/
        
        
      
       
        c.add(reg);
        c.add(log);
        c.add(top);
      
        c.add(w);
        c.add(or);        
        
        
        back.addActionListener(new ActionListener(){
        
         
          public void actionPerformed(ActionEvent e)
          {
               
              
             FrontPage fa = new FrontPage();
             fa.setVisible(true);
              dispose();
              
              
          }
          
          
      });
        
         reg.addActionListener(new ActionListener(){
        
         
          public void actionPerformed(ActionEvent e)
          {
               
              
               RegDoctor dg = new RegDoctor();
                dg.setVisible(true);
              dispose();
              
          }
          
          
      });
         
          log.addActionListener(new ActionListener(){
        
         
          public void actionPerformed(ActionEvent e)
          {
               
              
               DocLog dl = new DocLog();
                       dl.setVisible(true);
              dispose();
              
          }
          
          
      });
        
          
      }
    
}
