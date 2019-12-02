package com.ustglobal.objectclass;

public class TestA {
public static void main(String[] args) {
	

	PenDrive p = new PenDrive();
	UsbPort.conn(p);
	Mouse m = new Mouse();
	UsbPort.conn(m);
}
}