package com.jspider.filehandling.info;

import java.io.File;
import java.io.IOException;

public class FileInfoDemo 
{
	public static void main(String[] args) {
		//Using Default Path
		File file=new File("hello.txt");
		if (file.exists()) {
			System.out.println("file already exits");
		}
		else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	// getName(): this method use to get a name of file
		System.out.println("name of file  : "+ file.getName());
	//getAbsolutePath() : this method is use to find absolute path of any file
		System.out.println("path of file : "+ file.getAbsolutePath());
	//length() : this method is use to find size or length of the given file
		System.out.println("Length of File : "+ file.length());
	//canRead() : this method is use to check whether given file is readable or not
		if (file.canRead()) {
			System.out.println("the file is readable");
		}else {
			System.out.println("The file is Not readable.");
		}
	//canWrite : this method is use to check weather the given file is writable or not
		if (file.canWrite()) {
			System.out.println("The File is writable. ");
			
		}else {
			System.out.println("The File is not writable.");
		}
	//canExucute : this method is use to check weather the given file is exucutable or not
		if (file.canExecute()) {
			System.out.println("the file is exucutable");
			
		}else System.out.println("file is not exucutable");{
			
		}
	} 

}
