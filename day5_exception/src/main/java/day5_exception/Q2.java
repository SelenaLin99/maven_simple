package day5_exception;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2) Write an example for un-checked exception, and handle it using try catch block.
		// ClassCastException 
		
		try {
			String[] strArray = { "Ostrich", "Emu" };
			ArrayList<String> strList = (ArrayList<String>) Arrays.asList(strArray);
			System.out.println(strList);
		}catch(ClassCastException ce) {
			System.out.println("ClassCastException has occured.");
		}
		
		
		

	}

}
