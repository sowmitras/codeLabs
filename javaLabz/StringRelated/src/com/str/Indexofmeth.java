package com.str;

public class Indexofmeth {

public static void main(String[] args) {
	
String s="This is string class";

int index=s.indexOf("is");

System.out.println(index); //2

int index1=s.indexOf('i');

System.out.println(index1);//2

int index3=s.indexOf("is",3);

System.out.println(index3);//5

int index4=s.indexOf("is",10);
System.out.println(index4); //-1 if no match
	
}

}
