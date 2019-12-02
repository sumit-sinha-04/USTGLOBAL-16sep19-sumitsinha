package com.ustglobal.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingClass {

	public static void main(String[] args) {
		String path="C:\\Users\\sesum\\Desktop\\sumit.txt";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			int i1=   reader.read();
			while ((i1=reader.read())!=-1) {
				//type type = (type) .nextElement();

				System.out.print((char)i1);
			}

			//		char ch1=(char)i1;
			//	System.out.println(ch1);

		} catch (IOException e) {
			e.printStackTrace();

		}








	}	

}
