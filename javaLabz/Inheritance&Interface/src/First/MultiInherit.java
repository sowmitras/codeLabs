/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package First;

/**
 *
 * @author surbhi_khare
 */
//5.8
public class MultiInherit {

    public static void main(String args[]) {
        System.out.println("Creating a Car");
        Maruti c = new Maruti();
        c.start();
        c.drive();
        c.own();
        System.out.println();
    }
}
