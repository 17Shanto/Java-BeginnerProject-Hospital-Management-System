
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
public class DocLog extends JFrame {
    private Container c;
    private JLabel username, password;
    private JTextField Fname,Fpass;
    private Font f,f1,f3;
    private JButton Sub;
    private Cursor cursor;
    
    DocLog()
    {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,50,550,600);
        setTitle("Doctor Login");
    }
    
    public void initComponents()
    {
        f = new Font("Times new Roman",Font.HANGING_BASELINE,25);
        f1 = new Font("Times new Roman",Font.BOLD,20);
        f3 = new Font("Times new Roman",Font.PLAIN,20);
        
        username = new JLabel("Username ");
        password = new JLabel("Password");
        Fname = new JTextField();
        Fpass = new JTextField();
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);
        
        username.setBounds(10,300,300, 40);
        username.setFont(f1);
        username.setForeground(Color.BLACK);
        
        password.setBounds(10,350,300, 40);
        password.setFont(f1);
        password.setForeground(Color.BLACK);
        
        Fname.setBounds(145,300,250, 40);
        Fname.setFont(f3);
        Fname.setForeground(Color.BLACK);
        Fname.setOpaque(true);
        Fname.setBackground(Color.white);
        
        Fpass.setBounds(145,350,250, 40);
        Fpass.setFont(f3);
        Fpass.setForeground(Color.BLACK);
        Fpass.setOpaque(true);
        Fpass.setBackground(Color.white);
        
        Sub = new JButton("Login");
        cursor = new Cursor(Cursor.HAND_CURSOR);
        Sub.setFont(f1);
        Sub.setCursor(cursor);
        Sub.setBounds(180, 450,150, 50);
        Sub.setBackground(Color.GREEN);
        
        
        ImageIcon logo = new ImageIcon(getClass().getResource("logo.jpg"));
		JLabel logoIcon = new JLabel(logo);
		logoIcon.setBounds(140,40,275,176);
		c.add(logoIcon);
                
        
        Font  ff = new Font("Times new Roman",Font.BOLD,18);
        JButton back = new JButton("Back");
        back.setFont(ff);
        back.setCursor(cursor);
        back.setBounds(10, 460,78, 40);
        back.setBackground(Color.white);
        back.setOpaque(true);
        back.setForeground(Color.red);
        JButton exit = new JButton("Exit");
        exit.setBounds(450, 460,78, 40);
        exit.setFont(f3);
        exit.setCursor(cursor);
        exit.setBackground(Color.WHITE);
         exit.setOpaque(true);
        exit.setForeground(Color.red);
        
        c.add(exit);
        c.add(back);
        c.add(username);
        c.add(password);
        c.add(Fname);
        c.add(Fpass);
        c.add(Sub);
        
        
        Sub.addActionListener(new ActionListener(){
        
         
          public void actionPerformed(ActionEvent e)
          {
              
              String n = Fname.getText();
              String p = Fpass.getText();
              ListIterator li  = null;
              Registration_Doctor ob = new Registration_Doctor();
              ArrayList<Registration_Doctor> dInfo = new ArrayList<Registration_Doctor>();
              dInfo = ob.ReadFile();
              li = dInfo.listIterator();
              boolean found = true;
              String docName ;
              while(li.hasNext())
                         {
                             Registration_Doctor dx = (Registration_Doctor)li.next();
                             if(n.equals(dx.userName) && p.equals(dx.passWord))
                             {
                                 found = false;
                                 docName = dx.dname;
                                 DisplayDoc dp = new DisplayDoc(dx.dname,dx.specialty,dx.Time,dx.room);
                                 dp.setVisible(true);
                                  //JOptionPane.showMessageDialog(null,"Sucessfully LogIn");
                                  dispose();
                             }
                         }
              if(found)
              {
                  JOptionPane.showMessageDialog(null,"Username or Password doesn't match",
                  "Please Try Again", JOptionPane.WARNING_MESSAGE);
                  DocLog dl = new DocLog();
                       dl.setVisible(true);
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
        
        exit.addActionListener(new ActionListener(){
        
         
          public void actionPerformed(ActionEvent e)
          {
              JOptionPane.showMessageDialog(null,"Thank You\nFor visiting our site");
               dispose();
                
          }
      });
        
    }
    
    
}
