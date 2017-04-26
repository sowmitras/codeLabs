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
//6.13
public class Stream {

    public static void main(String args[]) {
        try {
            String str = "Java is a programming lang";

            FileWriter fw = new FileWriter("filereadwrite.txt");

            for (int i = 0; i < str.length(); i++) {
                fw.write(str.charAt(i));
            }
            fw.flush();
            fw.close();

        } catch (Exception e) {
            System.out.println("IOException:" + e.toString());
        }
    }

}
