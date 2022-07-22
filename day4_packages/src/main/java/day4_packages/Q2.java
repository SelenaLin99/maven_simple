package day4_packages;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		2) Create a stringbuffer and practice its methods.
		String ostrichStr = "ostrich";
		StringBuffer ostrichSB = new StringBuffer(ostrichStr);
		
		// length()
		System.out.println(ostrichSB.length());
		// append(String)
		System.out.println(ostrichSB.append(" likes to sleep."));
		// capacity()
		System.out.println(ostrichSB.capacity());
		// insert(int, String)
		System.out.println(ostrichSB.insert(0, "Female "));
		// delete (start_index, no_of_chars)
		System.out.println(ostrichSB.delete(0, 7));
		// reverse()
		System.out.println(ostrichSB.reverse());

		

	}

}
