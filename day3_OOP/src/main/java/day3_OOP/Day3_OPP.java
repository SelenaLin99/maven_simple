package day3_OOP;

public class Day3_OPP {

	public static void main(String[] args) {
		// driver
//	1) Write a program for Inheritance example 
		System.out.println("Q1");
		System.out.println();
		Ostrich ostrich = new Ostrich("Ollie", "F");
		ostrich.intro();
		ostrich.call();

//	2) Write a program for Method overloading example.
		System.out.println("Q2");
		System.out.println();
		Calculator ol = new Calculator();
		int n1 = ol.subtract(8, 2);
		System.out.println("n1 " + n1);
		int n2 = ol.subtract(n1, 1, 2);
		System.out.println("n2 " + n2);

//	3) Write a program for constructer overloading example.
		System.out.println("Q3");
		System.out.println();
		Bird b1 = new Bird();
		Bird b2 = new Bird("Emu", "M");
		b1.intro();
		b2.intro();

//	4) Write a program for method overriding example
		System.out.println("Q4");
		System.out.println();
		Bird maybeEmu = new Emu();
		maybeEmu.call();
//	5) Write a abstract class and implement abstract methods in sub class.
		System.out.println("Q5");
		System.out.println();
		SocialPlatform sp = new Facebook();
		sp.avaliablity();
		sp.icon();
//	6) Write a interface and implementation class for it.
		System.out.println("Q6");
		System.out.println();
		AppleProduct iphone = new Iphone();
		iphone.product();
		iphone.pricing();
		AppleProduct mac = new Mac();
		mac.product();
		mac.pricing();

//	7) Write a program by using super keyword for variable, methods and constructer.
		System.out.println("Q7");
		System.out.println();
		Snack snack = new Snack();
		System.out.println(snack.getDetails());
//	8) Write a program for final keyword by using to class, methods and variable.
		System.out.println("Q8");
		System.out.println();
		Plushie ostrichPlush = new Plushie();
		 ostrichPlush.stare(); 
		

	}

}
