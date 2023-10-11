package org.Student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	
	
	public void studentName()  {
		System.out.println("Kannan");
	}
	
	public void studentDept()  {
		System.out.println("CS");
	}
	
	public void studentId()   {
		System.out.println("76675");
	}
	
	public static void main(String[] args) {
		Student records=new Student();
		records.collegeCode();
		records.collegeName();
		records.collegeRank();
		records.deptName();
		records.deptStaffs();
		records.deptStudents();
		records.studentName();
		records.studentDept();
		records.studentId();
		
		
	}

}
