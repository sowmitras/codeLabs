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
//6.14
import java.io.*;

public class ReadData {

    public static void main(String args[]) {
        try {
            int ch;
            FileReader fr = null;
            fr = new FileReader("filereadwrite.txt");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (FileNotFoundException fe) {
            System.out.println("File not found" + fe.toString());
        } catch (IOException e) {
            System.out.println("IOException" + e.toString());
        }
    }

}
