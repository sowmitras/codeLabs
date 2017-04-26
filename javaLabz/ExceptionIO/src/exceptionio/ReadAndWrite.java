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
//6.15
public class ReadAndWrite {

    public static void main(String args[]) {
        try {
            char[] in = new char[50];
            int size = 0;
            File file = new File("MyFile2.txt");

            FileWriter fw = new FileWriter(file);
            fw.write("Line 1:123456\nLine2:abcde\n");
            fw.flush();
            fw.close();

            FileReader fr = new FileReader(file);

            size = fr.read(in);
            System.out.println(size + "");

            for (char c : in) {
                System.out.print(c);
            }
            fr.close();

        } catch (IOException e) {

        }

    }

}
