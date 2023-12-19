package com.csi.core;

import java.io.File;

public class DeleteFileEx {
	
	public static void main(String[] args) {
		
		File file = new File("D://abc.xls");
		
		file.delete();
		
		System.out.println("File deleted Successfully");
	}

}
