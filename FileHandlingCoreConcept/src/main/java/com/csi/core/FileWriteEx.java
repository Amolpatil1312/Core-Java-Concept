package com.csi.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {

	public static void main(String[] args) {
		File file = new File("D://j2ee/abc.txt");

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			fileWriter.write("WELCOME TO PUNE");
			fileWriter.close();

			System.out.println("File written successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
