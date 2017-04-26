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
//6.5
public class DemoFinally {

    public static void main(String args[]) {
        int input, result;

        try {
            input = 5;
            result = input * input;
            System.out.println("Multipllication of " + input + " is " + result);

        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("finally block must be exceuted");
        }
    }

}
