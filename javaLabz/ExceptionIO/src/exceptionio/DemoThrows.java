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
//6.6
class ABC {

    public void disp() throws IOException {
        System.out.println("It is a super class");
    }
}

class XYZ extends ABC {

    public void disp() throws IOException {
        // super.disp();
        System.out.println("It is a sub class");
    }

}

public class DemoThrows extends ABC {

    public void disp() throws EOFException, FileNotFoundException, IOException {
        super.disp();
        System.out.println("It is subclass named DemoThrows");
    }

    public static void main(String args[]) throws IOException {
        DemoThrows obj = new DemoThrows();
        obj.disp();
    }

}
