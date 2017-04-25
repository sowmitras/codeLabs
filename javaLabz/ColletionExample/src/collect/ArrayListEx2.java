package collect;

import java.util.*;

public class ArrayListEx2 {

	public static void main(String[] args) {
		
		UserDefinedC obj=new UserDefinedC(1,"khare", 200.35f);
		
		UserDefinedC obj1=new UserDefinedC(2,"surbhi", 25896.568f);
		
		ArrayList al=new ArrayList();
		
		al.add(obj);
		
		al.add(obj1);
		
		Iterator it=al.iterator();
		
		while(it.hasNext())
		{
			UserDefinedC ud=(UserDefinedC)it.next();
			
			System.out.println(ud.id+"\n"+ud.name+"\n"+ud.salary);
			
		}
		
//		for(UserDefinedC ud:al)
//		{
//			
//			System.out.println(ud.id+"\n"+ud.name+"\n"+ud.salary);
//		}
	}

}
