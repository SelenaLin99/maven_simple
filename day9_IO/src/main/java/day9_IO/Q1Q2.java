package day9_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q1Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1) Write a program for reading binary file
//		2} Write a program for writing binary into a file

		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;
		int temp = 0;

		try {
			try {
				sourceStream = new FileInputStream(
						"C:\\Users\\Selen\\OneDrive\\Pictures\\Camera Roll\\ostrich_face.jpg");
				targetStream = new FileOutputStream(
						"C:\\Users\\Selen\\OneDrive\\Pictures\\Camera Roll\\ostrich_face3.jpg");

				while ((temp = sourceStream.read()) != -1) {
					targetStream.write((byte) temp);
				}
				System.out.println("Success");
			} catch (FileNotFoundException e) {
				e.printStackTrace();

			} catch (IOException e) {
				e.printStackTrace();

			}

		} finally {
			try {
				if (sourceStream != null) {
					sourceStream.close();
				}
				if (targetStream != null) {
					targetStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
