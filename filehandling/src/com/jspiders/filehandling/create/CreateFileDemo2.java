package com.jspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo2 {
	
	public static void main(String[] args) {
		//Using Absolute Path : Using Absolute path file created in the mentioned 
		                    // path 
		File file = new File("C:\\Apps\\WEJE3\\WEJM3.txt");
		if (file.exists()) {
			System.out.println("file already exits..!");
		}else {
			try {
				file.createNewFile();
				System.out.println("file created Successfully..!");
			} catch (IOException e) {
				System.out.println("file not created...!");
				e.printStackTrace();
			}
		}
	}

}
