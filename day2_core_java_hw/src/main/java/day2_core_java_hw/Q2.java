package day2_core_java_hw;

public class Q2 {

	public static void main(String[] args) {
		// 2) Take command like argument and check it is odd or even number
		// by using if statement
		int n = Integer.parseInt(args[0]);
		if (n % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");

		}

	}

}
