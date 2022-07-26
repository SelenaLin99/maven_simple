package day6_threads;


public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3) Write a program for synchronization example
		
		SenderThread1 s1 = new SenderThread1("Test 1");
		s1.start();
		SenderThread1 s2 = new SenderThread1("Test 2");
		s2.start();
		
	    try  
	    {   
	      s1.join();   
	      s2.join();   
	    }   
	    catch(Exception e)   
	    {   
	      e.printStackTrace(); 
	    }   
		
		

	}

}

class SenderThread1 extends Thread {
	
	private String message; 
	
	SenderThread1(String message){
		this.message = message;
	}

	SenderService ss = new SenderService();
	
	public void run() {
		ss.send(this.message);
	}
}


class SenderService {
	
	public synchronized void send(String message) {
		System.out.println("Sending\t" + message);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n" + message + " Sent");

	}
}
