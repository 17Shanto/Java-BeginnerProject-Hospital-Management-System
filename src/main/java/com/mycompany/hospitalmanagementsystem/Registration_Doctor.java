
package com.mycompany.hospitalmanagementsystem;

import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Registration_Doctor implements Serializable {
    String dname, specialty, Time,room, userName, passWord;
    
     ArrayList<Registration_Doctor> d = new ArrayList<Registration_Doctor>();
       
        File fileDoctor = new File("Doctor.txt");
        ObjectOutputStream dobs =  null;
        ObjectInputStream dibs = null;
        ListIterator li  = null;
        Registration_Doctor()
        {
            
        }
    
    Registration_Doctor(String dname, String specialty,String Time,String room,String userName,String passWord )
    {
        this.dname = dname;
        this.specialty = specialty;
        this.Time = Time;
        this.room = room;
        this.userName = userName;
        this.passWord = passWord;
    }
    //String dname, specialty, Time,room, userName, passWord;
     public void saveFile(String name, String specialty, String Time, String room,String userName,String passWord )
    {   try{
        if(fileDoctor.isFile())
        {
             dibs =  new ObjectInputStream(new FileInputStream(fileDoctor));
             d= (ArrayList<Registration_Doctor>) dibs.readObject();
             dibs.close();
        }
           
            d.add(new Registration_Doctor(name,specialty,Time,room,userName,passWord));
            dobs = new ObjectOutputStream(new FileOutputStream(fileDoctor));
            dobs.writeObject(d);
            dobs.close();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
     
     public ArrayList<Registration_Doctor> ReadFile()
     {
            try
            {
                dibs =  new ObjectInputStream(new FileInputStream(fileDoctor));
                          d = (ArrayList<Registration_Doctor>) dibs.readObject();
                          dibs.close();
                 
                          
            }
            catch(Exception e)
        {
            System.out.println(e.toString());
        }
            return d;
            
     }
    
}
