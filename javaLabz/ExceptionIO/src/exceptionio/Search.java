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
//6.12
public class Search {

    public static void main(String args[]) {
        String[] files = new String[100];
        File searchFile1 = new File("Company");
        System.out.println("The existance of company Directory is:" + searchFile1.isDirectory());

        File searchFile2 = new File("kogeent");
        System.out.println("The existance of kogent Directory is:" + searchFile2.isDirectory());

        files = searchFile2.list();
        for (String fnd : files) {
            System.out.println("File" + fnd);
        }

    }
}
