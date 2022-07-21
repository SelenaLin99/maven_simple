package day2_core_java_hw;

public class Q8 {

	public static void main(String[] args) {
		// 8)Print odd number between 50 to 100 using do…while
		int i = 50;
		do {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		}while(i <= 100);

	}

}
