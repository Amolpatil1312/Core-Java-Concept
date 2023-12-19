package com.csi.core;

import java.io.File;
import java.io.IOException;

public class CreateFileConcept {

	public static void main(String[] args) {

		File file = new File("D://j2ee/Abc.doc");

		try {
			if (file.createNewFile()) {
				System.out.println("\n File Created Successfully: " + file.getName());
			} else {
				System.out.println("File Already Exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
