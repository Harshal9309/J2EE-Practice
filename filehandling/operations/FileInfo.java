package com.jsoiders.filehandling.operations;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		File file = new File("Demo.txt");
		
		if(file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length());
			
			if(file.canWrite()) {
				System.out.println("File is writeable");
			}else {
				System.out.println("File is not writeable");
			}
			if(file.canRead()) {
				System.out.println("File is Readable");
			}else {
				System.out.println("File is not Readable");
			}
			if(file.canExecute()) {
				System.out.println("File is Executable");
			}else {
				System.out.println("File is not Executable");
			}
		}
	}
}
