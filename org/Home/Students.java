package org.Home;

public class Students {
	
	public void getStudentInfo() {
		System.out.println("getStudentInfo");
	}
	
	public void getStudentInfo(int id) {
		System.out.println("id");
	}
	
	public void getStudentInfo(String name,int id)  {
		System.out.println("name");
	}
	
	public void getStudentInfo(int phonenumber, String email)  {
		System.out.println("phonenumber");
		System.out.println("email");
		
	}
	public static void main(String[] args) {
		
		Students student=new Students();
		student.getStudentInfo();
		student.getStudentInfo(77);
		student.getStudentInfo("Kannan", 77);
		student.getStudentInfo(987654327, "kannankrish5502@mail.com");
		
	}

}