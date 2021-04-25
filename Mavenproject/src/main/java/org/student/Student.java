package org.student;

import org.department.Department;

public class Student  extends Department  {
	public void stundentName() {
		
		System.out.println("Razik");
	}
	
public void studentDept() {
		
		System.out.println("B.com");
	}
public void studentId() {
	
	System.out.println("5574");
}

public static void main(String[] args) {	
	Student std = new Student();
	std.collegeCode();
	std.collegeName();
	std.collegeRank();
	std.deptName();
	std.stundentName();
	std.studentId();
	std.studentDept();
}

}
