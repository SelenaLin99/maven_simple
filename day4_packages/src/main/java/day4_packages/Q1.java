package day4_packages;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1) Create a string and practice string methods.
		String ostrichStr = "Ostrich";
		// charAt example
		System.out.println(ostrichStr.charAt(0));
		System.out.println(ostrichStr.charAt(5));	
		System.out.println(ostrichStr.charAt(3));	
		// concat example
		String helloOstrichStr = "Hello ".concat(ostrichStr);
		System.out.println(helloOstrichStr);
		// length example
		System.out.println(ostrichStr.length());
		System.out.println(helloOstrichStr.length());
		// equals example
		String emu = new String("Emu");
		String kiwi = new String("Kiwi");
		System.out.println("Emu does not equal to Kiwi" + emu.equals(kiwi));
		// equalsignorecase
		System.out.println("Emu squals to emu " + emu.equalsIgnoreCase("emu"));
		// split example
		String fact = "Ostriches are beautiful";
		String factSplit[] = fact.split(" ");
		for (String fs: factSplit) {
			System.out.println(fs);
		}
		// compareTo example
		System.out.println(ostrichStr.compareTo(kiwi));
		System.out.println(kiwi.compareTo(ostrichStr));


		

		


		




	}

}
