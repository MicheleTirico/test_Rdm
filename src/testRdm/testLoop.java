package testRdm;

public class testLoop {

	public static void main(String[] args) {
		
		
		int step ;
		
		for (step = 1; step <= 5 ; step++) {
			double act0 = 0  , act1 = 0 ;
			System.out.println("step " + step);
			
			if (step == 1 ) {
				act0 = 1;
			}
			else {
				act0 = ret(act0, act1);
			}
			
			act1 = ret(act0, act1) ;
			System.out.println("act0 = " + act0);
			System.out.println("act1 = " + act1);
		
		}
		
		
		}
			
	public static double ret (double act0, double act1) {
		act1 = act0 + 12;
		return act1;
	}

}
