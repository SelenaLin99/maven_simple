package day4_packages;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 6) Create a two dimentional array and iterate and display all elements in matrix format.
		int [][] matrix = {{2,3},{4,7},{6,9}};
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
