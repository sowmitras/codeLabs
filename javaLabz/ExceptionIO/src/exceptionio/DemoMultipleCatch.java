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
//6.8
public class DemoMultipleCatch {

    public static void main(String args[]) {
        try {
            int a[] = { };
            for (int i = 0; i < a.length; i++) {
                System.out.println("value at position" + i + " is " + a[i]);
            }

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Array is out of bound; please check upper bound of array");
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
