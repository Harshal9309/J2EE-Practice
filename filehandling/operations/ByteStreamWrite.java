package com.jsoiders.filehandling.operations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {

	public static void main(String[] args) throws IOException {
		
		File file = new File("Demo.txt");
		if(file.exists()) {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(1244);
			System.out.println("Data is written to the file");
			fileOutputStream.close();
		}else {
			boolean stutus = file.createNewFile();
			if(stutus) {
				System.out.println("File Created Succesfully");
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				fileOutputStream.write(1244);
				System.out.println("Data is written to the file");
				fileOutputStream.close();
			}else {
				System.out.println("File not Created");
			}
		}
	}
}
