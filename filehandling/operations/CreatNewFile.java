package com.jsoiders.filehandling.operations;

import java.io.File;
import java.io.IOException;

public class CreatNewFile {

	public static void main(String[] args) {
		File file = new File("Demo.txt");
		
		try {
			boolean stutus = file.createNewFile();
			if(stutus) {
				System.out.println("File created Succefully");
			}else {
				System.out.println("File already Exist");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
