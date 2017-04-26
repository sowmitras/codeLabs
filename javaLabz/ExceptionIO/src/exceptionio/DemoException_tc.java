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
//6.3
public class DemoException_tc {

    public static void main(String args[]) {

        try {
            int x = 5;
            int y = 0;
            int z = x / y;
            System.out.println("Result of program:" + z);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("A number cannot be divided by zero");
        }
    }

}
