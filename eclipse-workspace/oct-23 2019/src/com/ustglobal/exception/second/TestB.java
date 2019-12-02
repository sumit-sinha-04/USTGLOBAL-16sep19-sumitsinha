package com.ustglobal.exception.second;

import java.io.IOException;

public class TestB {

	public static void main(String[] args) {

		System.out.println("main started");

		FileTest ft = new FileTest();

		try {
			ft.open();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}





		System.out.println("main ended");

	}
}
