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
//5.20

class Super_class
{
   void display()
    {
        System.out.println("Invoking super class method");
    }
}
public class Sub_class extends Super_class{
    public void display()
    {
        super.display();
        System.out.println("Invoking subclass method");
    }
    public static void main(String args[])
    {
        System.out.println("Invoking members");
        Sub_class obj=new Sub_class();
        obj.display();
    }
    
}
