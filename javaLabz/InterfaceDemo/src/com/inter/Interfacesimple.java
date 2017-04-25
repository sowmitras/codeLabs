package com.inter;

interface A
{
	void print();
	int j=7412;
}

public class Interfacesimple implements A {
	
public void print()
{
	System.out.println("interface"+"\t"+j);
}

public static void main(String args[]){
	Interfacesimple i=new Interfacesimple();
	i.print();
}
}
