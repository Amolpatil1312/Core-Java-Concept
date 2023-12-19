package com.csi.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadEx {
	
	public static void main(String[] args) {
		File file = new File("D://j2ee/abc.txt");
		
		try {
			Scanner scanner = new Scanner(file);
			
			String fileContent = scanner.nextLine();
			
			System.out.println(fileContent);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
