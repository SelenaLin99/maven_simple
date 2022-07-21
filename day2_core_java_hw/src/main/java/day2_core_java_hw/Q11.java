package day2_core_java_hw;

public class Q11 {

	public static void main(String[] args) {
		//11)Iterate for loop form 50 to 100, and using break statement 
		//print only even numbers till 75.
		
		for(int i = 50; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			if(i == 75) {
				break;
			}
		}

	}

}
