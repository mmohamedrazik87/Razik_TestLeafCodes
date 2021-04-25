package week1.day2;

public 	class ClassWork2 {
	public int mobilePrice(int mobile1) {
		if (mobile1 ==1) {
				return 10000;}
		else if( mobile1 ==2) {
				return 20000;}
		else if (mobile1 ==3) {
				return 3000;}
		else return 4000;
			
	}

	
public String getModel() {
	return "MOTOROLA";
}



private String printPicture() {
		return "My Baby";
}



public static void main(String[] args) {
	ClassWork1 mobile = new ClassWork1();
	System.out.println(mobile.mobilePrice());
	System.out.println(mobile.getModel());
	
}

public int mobilePrice() {
	return 40000;
}
}





