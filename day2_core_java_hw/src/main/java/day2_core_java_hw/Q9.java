package day2_core_java_hw;

public class Q9 {

	public static void main(String[] args) {
		// 9) Print prime number from 1 to 100.
		for(int i = 1; i <= 100; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}

	}

	public static boolean isPrime(int n) {
		// since 0 and 1 is not prime return false.
		if (n == 1 || n == 0)
			return false;

		// Run a loop from 2 to n-1
		for (int i = 2; i <= n / 2; i++) {
			// if the number is divisible by i, then n is not a prime number.
			if (n % i == 0)
				return false;
		}
		// otherwise, n is prime number.
		return true;
	}

}
