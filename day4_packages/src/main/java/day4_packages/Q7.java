package day4_packages;

class Client{

	protected String name;
	private String ssn;
	private int creditScore;
	
	
	public Client(String name, String ssn, int creditScore) {
	
		this.name = name;
		this.ssn = ssn;
		this.creditScore = creditScore;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNameRef(Client clientRef) {
		this.name = clientRef.name;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	
}
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		7) Write an example for pass by value and pass by reference.
		Client journalist = new Client("Anastasia Steele", "XXX-XX-XXXX",720);
		journalist.setName("Anastasia Grey");
		System.out.println("Pass by value " +  journalist.getName());
		journalist.setNameRef(journalist);
		System.out.println("Pass by reference " +  journalist.getName());




	}

}
