package com.jsoiders.filehandling.operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWrite {

	public static void main(String[] args) throws IOException {
		
		File file = new File("Demo.txt");
		
		if(file.exists()) {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Java is programing language");
			System.out.println("Data is written inside the file");
			fileWriter.close();
		}else {
			
			boolean stutus = file.createNewFile();
			if(stutus) {
				System.out.println("File is Created");
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write("Java is programing language");
				System.out.println("Data is written inside the file");
				fileWriter.close();
			}else {
				System.out.println("File is not created");
			}
		}
	}
}
