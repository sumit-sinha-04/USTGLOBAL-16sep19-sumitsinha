package com.ustglobaldi;

import java.util.Map;

import org.springframework.stereotype.Component;
@Component("hello")
public class Hello {

	
	private String msg;
	public Map<String, Integer> map;
	

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
public void init()
{
System.out.println("init method executing from hello");
}
	
public void destroy()
{
System.out.println("Destroy method executing from hello");	
}
	
	
	
	
	
	
	
	
}
