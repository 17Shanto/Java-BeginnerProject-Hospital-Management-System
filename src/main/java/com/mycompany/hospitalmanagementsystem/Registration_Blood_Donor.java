
package com.mycompany.hospitalmanagementsystem;
import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Registration_Blood_Donor implements Serializable{
    String name, bloodGroup,phoneNumber,age;
    Boolean yes;
    Registration_Blood_Donor()
    {
        
    }
    
    Registration_Blood_Donor(String name, String bloodGroup,String phoneNumber,String age)
    {
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
 
    
    ArrayList<Registration_Blood_Donor> Bd = new ArrayList<Registration_Blood_Donor>();
     File fileDonor =  new File("BloodDonor.txt");
     ObjectOutputStream obs =  null;
     ObjectInputStream ibs = null;
     public void saveFile(String name, String blood, String age, String phone )
    {   
        
        try{
        if(fileDonor.isFile())
        {
             ibs =  new ObjectInputStream(new FileInputStream(fileDonor));
             Bd = (ArrayList<Registration_Blood_Donor>) ibs.readObject();
             ibs.close();
        }
           
            Bd.add(new Registration_Blood_Donor (name,blood,phone,age));
            obs = new ObjectOutputStream(new FileOutputStream(fileDonor));
            obs.writeObject(Bd);
            obs.close();
            
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
     
     
    public ArrayList<Registration_Blood_Donor> ReadFile()
     {
            try
            {
                ibs =  new ObjectInputStream(new FileInputStream(fileDonor));
                          Bd = (ArrayList<Registration_Blood_Donor>) ibs.readObject();
                          ibs.close();
                 
                          
            }
            catch(Exception e)
        {
            System.out.println(e.toString());
        }
            return Bd;
            
     }
}
