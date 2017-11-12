package testRdm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class testITerator {

	public static void main(String[] args) {
	
		Map<String , Double> map = new HashMap<String, Double>();
		
		map.put("gino", (double) 1) ;
		map.put("aldo", (double) 3);
	
		System.out.println(map);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i <= 10; i++) {
			list.add(i);
		}
	
		Iterator<Integer> iter = list.iterator();
		
		while (iter.hasNext()) {
	
			iter.next();
			System.out.println();
			
		}
		System.out.println(list);
		
		
		
		
		
		
		
		

	}
}
