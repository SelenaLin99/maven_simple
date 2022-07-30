package day9_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5) Write a program for BufferedReader and BufferedWriter.
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			Reader reader = new FileReader("C:\\Users\\Selen\\maven_simple\\day9_IO\\src\\main\\resources\\Hello.txt");
			br = new BufferedReader(reader);
			String line = null;
			
			File outFile = new File("C:\\Users\\Selen\\maven_simple\\day9_IO\\src\\main\\resources\\Hello3.txt");
			Writer writer = new FileWriter(outFile);
			bw = new BufferedWriter(writer);
			
			while((line = br.readLine()) != null) {
				bw.write(line);
				bw.flush();
			}
			System.out.println("Success");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
