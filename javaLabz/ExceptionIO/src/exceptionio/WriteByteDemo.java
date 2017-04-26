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
//6.19

import java.io.*;

public class WriteByteDemo {
    public static void main(String[] args) throws IOException {
        
        DataOutputStream out=new DataOutputStream(new FileOutputStream("TestFile.txt"));
        int unit=10;
        float price=3.6f;
        out.writeInt(unit);
         out.writeFloat(unit);
         out.flush();
         out.close();
        
        
    }

    
    
}
