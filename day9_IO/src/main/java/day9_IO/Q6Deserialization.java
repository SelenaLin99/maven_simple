package day9_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q6Deserialization {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fos = null;
		ObjectInputStream oos = null;
		
		try {
			fos = new FileInputStream("C:\\Users\\Selen\\maven_simple\\day9_IO\\src\\main\\resources\\Student.txt");
			oos = new ObjectInputStream(fos);
			Student s = (Student) oos.readObject();
			System.out.println(s.getId() + " " + s.getNetId() + " " + s.getPassword() + " " + s.getAge());
			System.out.println("success");
		}catch(FileNotFoundException e1) {
			e1.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}finally {
			try {
				fos.close();
				oos.close();
			}catch(IOException e1) {
				e1.printStackTrace();
			}
		}

	}

}
