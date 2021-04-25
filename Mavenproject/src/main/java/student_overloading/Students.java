package student_overloading;

public class Students {	


	public void getStudentInfo(int id, String name) {
				
		System.out.println( id + name);
	}
	
	
	public void getStudentInfo(String email, long phoneNumber) {
	
	System.out.println( email + phoneNumber);
	
	}
	
	public static void main(String[] args) {
		
		Students std = new Students();
		std.getStudentInfo(123, " Razik");
		std.getStudentInfo("vip@gmail.com ", 95978);
		
		
		
	}
		
	
}
