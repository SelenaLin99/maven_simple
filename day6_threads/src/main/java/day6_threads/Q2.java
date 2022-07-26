package day6_threads;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2) Write a program to create two threads
//		  i) first thread to print even nums
//	  ii) second thread to print odd nums

		PrintEvenThread1 printEven = new PrintEvenThread1();
		printEven.start();

		PrintOddThread2 printOdd = new PrintOddThread2();
		printOdd.start();

	}

}

class PrintEvenThread1 extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("even " + i);
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class PrintOddThread2 extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("odd " + i);
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}