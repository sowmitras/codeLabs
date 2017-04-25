package Sup;

class surbhi
{
	int a,b,c;
	
   surbhi(int a,int b,int c) {
	   
	a=a;
	b=b;
	c=c;
	System.out.println(a+"\t"+b+"\t"+c);
	
}
}

class Khare extends surbhi{
	
	Khare() {
	super(1, 8,5);
	System.out.println("khare");  
	 
}	
}

public class Supervar {

public static void main(String[] args) {
	Khare k=new Khare();
	
	
	}

}
