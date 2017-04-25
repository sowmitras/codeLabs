package collect;

import java.util.*;

public class ArrayList6 {

public static void main(String[] args) {
		
	ArrayList<String> al=new ArrayList<String>();
	
	al.add("surbhi");
	al.add("khare");
	al.add("java");
	
	ArrayList<String> al1=new ArrayList<String>();
	
	al1.add("khare");
	al1.add("veer");
	al1.add("shivi");
	
	al.retainAll(al1);
	
	Iterator it=al.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	

	}

}
