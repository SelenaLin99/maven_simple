package day5_exception;

class Building {

	private int floors;

	public Building(int floors) {
		super();
		this.floors = floors;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1) Write an example for checked exception.

		// clone not supported Exception
		Building b = new Building(4);
		b.clone(); // error 
	}

}
