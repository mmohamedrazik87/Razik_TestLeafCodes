package org.university;

public interface University {

	public void ug();
	
	default void pg() {
		System.out.println("PG implmented in Interfacing using default access modifier");
	}
	
	
}
