package day4_packages;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	4) Create an integer array with 10 valus
		int arr [] = {4,6,1,5,7,8,2,3,9,10};
		
//		i) find the sum of even numbers from that array
		int sumEven = 0;
//		il) find sum of odd number from that array,
		int sumOdd = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("even " + arr[i]);
				sumEven += arr[i];
				
			}else {
				System.out.println("odd " + arr[i]);
				sumOdd += arr[i];
			}			
		}
		
		System.out.println("even Sum " + sumEven);
		System.out.println("odd Sum " + sumOdd);



	}

}
