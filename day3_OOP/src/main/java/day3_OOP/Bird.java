package day3_OOP;
//1) Write a program for Inheritance example 
class Bird {
	private String name; 
	private String gender;
	
	
	Bird(){
		this.name = "unknown";
		this.gender = "unknown";
	}
	Bird(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	
	public void intro() {
		System.out.println("Hello, my name is " + this.name + " and my gender is " + 
	this.gender);
	}
	public void call() {
		System.out.println("Birds can make a lot of sounds, usuallu chirp chirp");
	}
}
class Ostrich extends Bird{

	Ostrich(String name, String gender) {
		super(name, gender);
	}

	public void call() {
		System.out.println("Woooooooooooo!!!!!");
	}
}
class Emu extends Bird{


	public void call() {
		System.out.println("HISSSSSSSSSSS!!!!!");
	}
}


