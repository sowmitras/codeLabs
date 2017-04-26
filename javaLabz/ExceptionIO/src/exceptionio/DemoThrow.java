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
//6.7
import java.io.*;

public class DemoThrow {

    public static void chk_throw() {
        try {
            throw new IOException("Explicit IOExcption");
        } catch (Exception e) {
            System.out.println("Exception is:" + e);
        }
    }

    public static void main(String args[]) {
        DemoThrow.chk_throw();
    }

}
