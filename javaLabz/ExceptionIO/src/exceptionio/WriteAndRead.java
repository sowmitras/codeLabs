/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionio;
import java.io.*;

/**
 *
 * @author surbhi_khare
 */
//6.10
public class WriteAndRead {
public static void main(String args[])
{
    try
    {
        boolean b=false;
        
        File f=new File("khare.txt");
        System.out.println(f.exists());
        
        b=f.createNewFile();
        System.out.println(b);
        System.out.println(f.exists());
    }
    catch(Exception e)
    {
        
    }
    
}
    
}
