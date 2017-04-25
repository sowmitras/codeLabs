package collect;
import java.util.*;

public class TreeSet1 {

	public static void main(String[] args) {
		
		TreeSet treeset=new TreeSet();
		
		//treeset.add(null);
		treeset.add(5);
		treeset.add(4);
		treeset.add(3);
		treeset.add(2);
		treeset.add(1);
		treeset.add(0);
		
//		treeset.add(5.3f);
//		treeset.add("hello");
		
		Iterator it=treeset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
