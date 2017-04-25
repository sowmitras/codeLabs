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
//5.17
class SuperDemo
{
    int val1=100;
}

public class Sub extends SuperDemo{
    int val1=200;
    public void show()
    {
        System.out.println("From superclass:"+super.val1);
         System.out.println("From subclass:"+val1);
    }
    public static void main(String args[]){
         System.out.println("using super");
         Sub obj=new Sub();
         obj.show();
        
    }
    
}
