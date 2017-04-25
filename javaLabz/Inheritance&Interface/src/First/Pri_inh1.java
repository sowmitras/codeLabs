/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//5.15
package First;

class MySuperPublic1
{
    private String name="khare";
    
}
class MySubPublic1 extends MySuperPublic1
{
    public void displayName()
    {
        System.out.println("your name is:"+name);// name is priavate variable thats why we are not able to use in public class.
    }
}
public class Pri_inh1 {
    public static void main(String args[])
    {
      MySubPublic1 c=new MySubPublic1();
      c.displayName();
    }
    
}
