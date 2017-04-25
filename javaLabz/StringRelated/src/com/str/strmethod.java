package com.str;

public class strmethod {

public static void main(String[] args) {
		
String s=" Surbhi khare Surbhi";

String st=s.join("@", "Surbhi","khare");

int  a=100;

char c='o';

String s2=s.valueOf(c);  //o

String s3=s.valueOf(a);  //100

String s4=s.replace("Su","t");//trbhi khare


String s5="aBCdefr";

byte[] b=s5.getBytes();

for(int i=0;i<b.length;i++)
	
System.out.println(b[i]); //97 66 67 101 102 114


String s6="";


System.out.println(s2);//o

System.out.println(s3);//100

String s1=s.intern();//Surbhi khare

System.out.println(s.toLowerCase()); // surbhi khare

System.out.println(s.trim());//surbhi khare

System.out.println(s.startsWith("Surbhi")); //true case sensitive

System.out.println(s.endsWith("ihi"));//false

System.out.println(s.charAt(3));//b

System.out.println(s);//Surbhi khare

System.out.println(s.length());//13 (+1)

System.out.println(s.contains("kh"));//true

System.out.println(s);

System.out.println(s4);

System.out.println(s1.isEmpty());//false

System.out.println(s6.isEmpty());//true

System.out.println(st);//Surbhi@khare

System.out.println(s.substring(2, 5));//urb

System.out.println(s.substring(2));//rbhi khare Surbhi

}

}
