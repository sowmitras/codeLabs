package com.clonn;

public class cloneexample implements Cloneable{ 
	
	int rollno; 
	
	String name;  
	  
	public cloneexample(int rollno,String name) {
		
	this.rollno=rollno; 
	
	this.name=name;  
	}  
	
	public Object clone()throws CloneNotSupportedException{  
		
	return super.clone();  
	}  
	  
	public static void main(String args[]){ 
		
	try{ 
		
	cloneexample s1=new cloneexample(101,"amit");  
	  
	cloneexample s2=(cloneexample)s1.clone();  
	  
	System.out.println(s1.rollno+" "+s1.name);
	
	System.out.println(s2.rollno+" "+s2.name);  
	  
	}catch(CloneNotSupportedException c){}  
	  
	}  
	}  
