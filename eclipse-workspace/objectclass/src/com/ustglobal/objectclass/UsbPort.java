package com.ustglobal.objectclass;

public class UsbPort {

	public static void conn(Object obj)
	{
		
		if(obj instanceof Mouse)
		{
			Mouse m = (Mouse) obj;
			m.click();
			m.scroll();
			2
			
		}
	else if(obj instanceof PenDrive)
		{
			PenDrive p = (PenDrive ) obj;
			
		p.read();
		p.write();
		}
		
		
		
	else {
		
		System.out.println("Invalid object");
	}
		
	}
	
}
