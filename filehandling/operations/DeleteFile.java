package com.jsoiders.filehandling.operations;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		 File file = new File("Demo.txt");
		 
		 if(file.exists()) {
			 boolean stutus = file.delete();
			 if(stutus) {
				 System.out.println("File deleted Succesfully");
			 }else {
				 System.out.println("File does not deleted");
			 }
		 }else {
			 System.out.println("File does not exists");
		 }
	}
}
