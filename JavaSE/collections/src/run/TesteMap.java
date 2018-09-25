package run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TesteMap {
	public static void main(String[] args) {
		Map<Long, String> maMap = new HashMap<>();
		maMap.put(1L, "physique ");
		maMap.put(14L, "BD");
		maMap.put(7L, "biologie");

		for (Entry<Long, String> entry : maMap.entrySet()) {
			System.out.println(entry.getKey()
					+ "/" + entry.getValue());
		}
 
		
		
		
		System.out.println(maMap.get(1L));
		maMap.remove(1L);
		
		
		
		Iterator<Entry<Long, String>> monIterator = 
				maMap.entrySet().iterator();

		while (monIterator.hasNext()) {
			Entry<Long, String> entry =   monIterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}
	}
}
