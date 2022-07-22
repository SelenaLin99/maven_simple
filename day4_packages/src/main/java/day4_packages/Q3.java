package day4_packages;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		3) Create a stringbuilder and practice its methods.
		String ostrichStr = "ostrich";
		StringBuilder ostrichSB = new StringBuilder(ostrichStr);
		// length()
		System.out.println(ostrichSB.length());
		// append(String)
		System.out.println(ostrichSB.append(" likes to sleep."));
		// indexOf(String)
		System.out.println(ostrichSB.indexOf("likes"));
		// replace(start, end, str)
		System.out.println(ostrichSB.replace(8, 14, "hates "));
		// insert(int, String)
		System.out.println(ostrichSB.insert(0, "Female "));
		// delete (start_index, no_of_chars)
		System.out.println(ostrichSB.delete(0, 7));
		// reverse()
		System.out.println(ostrichSB.reverse());



	}

}
