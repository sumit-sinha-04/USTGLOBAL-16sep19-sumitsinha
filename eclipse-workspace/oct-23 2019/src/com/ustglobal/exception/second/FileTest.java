package com.ustglobal.exception.second;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class FileTest {

	void open() throws IOException {

		File f = new File("b.txt");

		f.createNewFile();

		try {
			Class.forName("com.a");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
