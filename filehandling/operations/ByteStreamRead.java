package com.jsoiders.filehandling.operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamRead {

	public static void main(String[] args) throws IOException {
		File file = new File("Demo.txt");
		 if(file.exists()) {
			 FileInputStream fileInputStream = new FileInputStream(file);
			 System.out.println(fileInputStream.read());
			 fileInputStream.close();
		 }else {
			 System.out.println("File not Found");
		 }
	}
}
