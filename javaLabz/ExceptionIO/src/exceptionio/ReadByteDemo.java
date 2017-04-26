/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionio;

/**
 *
 * @author surbhi_khare
 */
//6.18
import java.io.*;
public class ReadByteDemo {
    public static void main(String[] args) {
        try
        {
            FileInputStream f;
            f=new FileInputStream("filereadwrite.txt");
            
            boolean eof=false;
            int count=0;
            
            while(!eof)
            {
                int i=f.read();
                System.out.println(i+" ");
                
                if(i==-1)
                    eof=true;
                else
                    count++;
            }
            f.close();
            System.out.println("\n Total number of bytes reads from files are:"+count);
        }
        catch(Exception e)
        {
            System.out.println(e); 
        }
        
    }
    
}
