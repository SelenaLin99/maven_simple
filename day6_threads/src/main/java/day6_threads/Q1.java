package day6_threads;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) Write a program for printing 1 to 50 from a thread
		
		Print50Thread print50 = new Print50Thread();
		print50.start();


	}

}
class Print50Thread extends Thread{
	
	public void run() {
		
		for(int i = 1; i <= 50; i++) {
			System.out.println(i);
		}
	}
}

