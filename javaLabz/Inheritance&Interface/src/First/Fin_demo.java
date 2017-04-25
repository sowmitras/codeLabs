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
//5.21

final class Fin_sup
{
    final void display()
    {
        System.out.println("Invoking superclass method");
    }
}
public class Fin_demo extends Fin_sup {
    public static void main(String args[])
    {
        System.out.println("Invoking members");
        Fin_demo obj=new Fin_demo();
        obj.display();
    }
    
    
}
