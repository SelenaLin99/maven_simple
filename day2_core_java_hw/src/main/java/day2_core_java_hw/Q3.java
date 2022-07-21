package day2_core_java_hw;

public class Q3 {

	public static void main(String[] args) {
		// 3) Print the given number(command line argument) is even or odd.
		int n = Integer.parseInt(args[0]);
		if (n % 2 == 0) {
			System.out.println(n + " is even");
		} else {
			System.out.println(n + " is odd");

		}


	}

}
