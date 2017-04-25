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
//5.23

interface Demo
{
    public void push(Object item);
    Object pop();
}
public class IntImpl implements Demo{
Object[] stArray;
int tos;
IntImpl(int capacity)
{
   
    stArray=new Object[capacity];
   // 
    tos=1;
   System.out.println("tos "+tos);
}

public void push(Object item)
{
    stArray[++tos]=item;
     System.out.println("push tos"+tos);
}
public Object pop()
{
    Object ob=stArray[tos];
    tos--;
     System.out.println("pop tos "+tos);
    return ob;
}
public static void main(String args[])
{
    IntImpl obj=new IntImpl(8);
   obj.push("1");
    obj.push("2");
    obj.push("3");
    obj.push("4");
    
    
    System.out.println(obj.pop());
    System.out.println(obj.pop());
    
    System.out.println(obj.pop());
    System.out.println(obj.pop());
     obj.push("4");
    obj.push("3");
    obj.push("2");
    obj.push("1");
    
    System.out.println(""+obj.pop()+obj.pop()+obj.pop()+obj.pop());
}
    
}
