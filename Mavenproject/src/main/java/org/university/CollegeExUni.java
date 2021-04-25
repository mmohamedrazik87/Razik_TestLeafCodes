package org.university;

public class CollegeExUni implements University {

	@Override
	public void ug() {
		// TODO Auto-generated method stub
		
		System.out.println("UG implemented in Class");
	}
	
public static void main(String[] args) {
	
	CollegeExUni coll = new CollegeExUni();
	coll.pg();
	coll.ug();
	
}
		
	}


