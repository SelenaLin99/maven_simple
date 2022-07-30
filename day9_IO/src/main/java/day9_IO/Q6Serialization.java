package day9_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Q6Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6) Create an object, serialize it and store in the file or Database.
		Student s = new Student(404, "sxl18003", "password", 20);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("C:\\Users\\Selen\\maven_simple\\day9_IO\\src\\main\\resources\\Student.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

}

@Setter
@Getter
@AllArgsConstructor
class Student implements Serializable {
	private static final long serialVersionUID = 800L;
	private int id;
	private String netId;
	private transient String password;
	private int age;

}
