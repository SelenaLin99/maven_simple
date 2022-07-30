package day9_IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q3Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3) Write a program for reading text file using char stream
		//4) Write a program for writing to text file using char stream.
		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader("C:\\Users\\Selen\\maven_simple\\day9_IO\\src\\main\\resources\\Hello.txt");
			out = new FileWriter("C:\\Users\\Selen\\maven_simple\\day9_IO\\src\\main\\resources\\Hello2.txt");
			
			int c = 0;
			
			while((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("Success");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null) {
					in.close();
				}
				if(out != null) {
					out.close();
				}		
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
