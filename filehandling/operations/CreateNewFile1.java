package com.jsoiders.filehandling.operations;

import java.io.File;
import java.io.IOException;

public class CreateNewFile1 {

	public static void main(String[] args) {
		 File file = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\filehandling2\\Demo.txt");
		 
		 try {
			boolean stutus = file.createNewFile();
			if(stutus) {
				System.out.println("file Created Suceesfully");
			}else {
				System.out.println("File Already Exists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
