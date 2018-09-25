package run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

 
public class TestSet {

	public static void main(String[] args) {
		Set<String> maSet = new HashSet<>();
		maSet.add("d");
		maSet.add("a");
		maSet.add("b");
		maSet.add("b");
		maSet.add("c");
		for (String element : maSet) {
			System.out.println(element);

		}
		System.out.println("*****************");
		Iterator<String> iterator=maSet.iterator();
		while (iterator.hasNext()) {
			String element =   iterator.next();
			System.out.println(element);
		}
		
	}

}
