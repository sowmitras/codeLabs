/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package First;

//5.25

interface Super
{
    public void msgfromSuper();
}
interface sub extends Super
{
public void msgfromSub();
}
 class Demo1 implements sub{
    public void msgfromSuper()
            {
                System.out.println("super Interface"); 
            }
    
    public void msgfromSub()
            {
                System.out.println("sub Interface"); 
            }
    
}
public class DemoImpl
{
    public static void main(String args[])
    {
       Demo1 obj=new Demo1();
        System.out.println("Execute interface:");
        
        obj.msgfromSuper();
        obj.msgfromSub();
    }
    
    
}
