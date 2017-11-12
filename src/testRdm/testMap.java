package testRdm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class testMap {

	public static void main(String[] args) {

		int step;
		
		Map<String, Double > map0 = new HashMap<String, Double>();
		Map<String, Double > map1 = new HashMap<String, Double>();
		
		for (step = 1 ; step <= 3; step++) {
			
			if ( step == 1) {
				map0.put( "aldo" , (double) 1);
				map0.put( "gino", (double) 2);
			}
			else {
				map0.put("aldo", ret(3));
				map0.put("gino", ret(4));
			}
			
			System.out.println(map0);
			map0.put("aldo", ret(5));
			map0.put("gino", ret(6));
			System.out.println(map0);
		}
		
		
		
		
		
	}
	public static double ret (double x) {
		return x;
		
	}

}
