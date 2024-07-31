package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SETExamples {

	public static void main(String[] args) {
	
		HashSet hs = new HashSet();
		hs.add(25);
		hs.add(11);
		hs.add(53);
		hs.add(121);
		hs.add(51);
		System.out.println(hs);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(25);
		lhs.add(11);
		lhs.add(53);
		lhs.add(121);
		lhs.add(51);
		System.out.println(lhs);
	}

}
    