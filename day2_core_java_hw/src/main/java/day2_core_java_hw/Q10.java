package day2_core_java_hw;

public class Q10 {

	public static void main(String[] args) {
		// 10) Iterate for loop form 1 to 100, 
		//and using continue statement print only add (odd)? numbers.
		for(int i = 1; i<= 100; i++) {
			if(i % 2 == 0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
		


	}

}
