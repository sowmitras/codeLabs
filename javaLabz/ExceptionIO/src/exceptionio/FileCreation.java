/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionio;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author surbhi_khare
 */
//6.9
public class FileCreation {
    public static void main(String str[])
    {
        File f=new File("khare.txt");
        
        try {
            
            System.out.println("file created successfully"+f.createNewFile());
//        
        } catch (IOException ex) {
            Logger.getLogger(FileCreation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
