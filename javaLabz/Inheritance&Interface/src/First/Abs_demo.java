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
//5.22

abstract class Abs_super
{
    abstract public void display();
}
public class Abs_demo extends Abs_super{

 
    public void display() {
        System.out.println("Executing abstract method");  
    }
    
    public static void main(String args[])
    {
        Abs_demo obj=new Abs_demo();
        obj.display();
        System.out.println("Abstract Demo Sucessful");
    }
    
    
}
