package com.phone_app_system.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hotel_Validation {
	Pattern pattern = null;
	Matcher matcher = null;
	
	public boolean idVer(String id) {
		
		pattern = Pattern.compile("\\d+");
		matcher = pattern.matcher(id);
		if (matcher.matches()==true) {
			
			return true;
			
			
		}
		return false;
		
	}
	public boolean nameVer(String name) {
		
		pattern = Pattern.compile("\\w+");
		matcher = pattern.matcher(name);
		
		if(matcher.matches()) {
			return true;
		}
		return false;
		
	}
	public boolean emailVer(String price) {
		
		pattern = Pattern.compile("\\d+\\.\\d+");
		matcher = pattern.matcher(price);
		
		if(matcher.matches()) {
			return true;
			
		}
		return false;
		
	}

}
