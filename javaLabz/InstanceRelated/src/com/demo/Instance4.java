package com.demo;

class A{  
A()
{ 	
System.out.println("parent class constructor invoked"); 
} 
}  
  
class Instance4 extends A{  
	
Instance4()
{  
	
System.out.println("child class constructor invoked"); 

}  
  
Instance4(int a){ 
	
System.out.println("child class constructor invoked "+a); 

}  
  
{
	
System.out.println("instance initializer block is invoked");

}  
  
public static void main(String args[]){
	
Instance4 b1=new Instance4(); 

Instance4 b2=new Instance4(10);  
}  
}  
