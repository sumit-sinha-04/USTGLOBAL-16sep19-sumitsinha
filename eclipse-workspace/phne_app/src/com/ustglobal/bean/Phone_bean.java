package com.ustglobal.bean;

public class Phone_bean {



		private int phone_no;
		private String name;
		private String groups;
		public int getPhone_no() {
			return phone_no;
		}
		public void setPhone_no(int phone_no) {
			this.phone_no = phone_no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGroups() {
			return groups;
		}
		public void setGroups(String groups) {
			this.groups = groups;
		}
		@Override
		public String toString() {
			return "Phone_bean [phone_no=" + phone_no + ", name=" + name + ", groups=" + groups + "]";
		}

		
	}







}
