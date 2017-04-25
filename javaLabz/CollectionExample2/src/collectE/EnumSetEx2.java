package collectE;
import java.util.*;

enum month{
	
	jan,feb,march,april,may,june,july;
}

public class EnumSetEx2 {

	public static void main(String[] args) {
		
		Set<month> s=EnumSet.allOf(month.class);
		 
		System.out.println("All month"+s);
		
		
        Set<month> s1=EnumSet.noneOf(month.class);
		
		System.out.println("None "+s1);
		

	}

}
