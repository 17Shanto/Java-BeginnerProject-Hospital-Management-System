
package com.mycompany.hospitalmanagementsystem;

import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Registration_Patient implements Serializable {
    
 String name, phoneNumber,age, disease,docName,gender;
  ArrayList<Registration_Patient> p = new ArrayList<Registration_Patient>();
   File filePatient = new File("Patient.txt");
   ObjectOutputStream pobs = null;
   ObjectInputStream pibs = null;
   
   Registration_Patient()
   {
       
   }
 Registration_Patient(String name, String phoneNumber,String age, String gender,String disease,String docName)
 {
     this.name= name;
     this.phoneNumber = phoneNumber;
     this.age = age;
     this.gender = gender;
     this.disease = disease;
     this.docName= docName;
 }
  public void saveFile(String name, String phone, String age, String gender,String disease,String docName )
    {   try{
        if(filePatient.isFile())
        {
             pibs =  new ObjectInputStream(new FileInputStream(filePatient));
             p = (ArrayList<Registration_Patient>) pibs.readObject();
             pibs.close();
        }
           
            p.add(new Registration_Patient (name,phone,age,gender,disease,docName));
            pobs = new ObjectOutputStream(new FileOutputStream(filePatient));
            pobs.writeObject(p);
            pobs.close();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
  
   public ArrayList<Registration_Patient> ReadFile()
     {
            try
            {
                pibs =  new ObjectInputStream(new FileInputStream(filePatient));
                          p = (ArrayList<Registration_Patient>) pibs.readObject();
                          pibs.close();
                 
                          
            }
            catch(Exception e)
        {
            System.out.println(e.toString());
        }
            return p;
            
     }
  
 
    
}