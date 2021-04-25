package week1.day2;

import org.checkerframework.checker.units.qual.mol;

public class Day1Class_Razik {
	public String getBrand()
	{
		return "MOTOROLA";

}

	public int getPrice (int mobile) {
		if(mobile==1) {
			return 10000;
		}
		else if (mobile==2)
			return 20000;
		else if (mobile==3)
			return 20000;
		else {
			return 40000;
		}
	}
	
	public String getmodel(int mobileModel) {
		//String a = "NODE5G";
		//String b = "NODE4G";
		if (mobileModel == 1) {
			return "a";}
		else if (mobileModel == 2) {
			return "b";}
			else return "null";
		}
	
	

	public char phoneSymbol() {
		return 'M';}
	
	
	public long phoneImea() {
		return 988877887;
		
	}


public static void main(String[] args) {
	Day1Class_Razik mobile = new Day1Class_Razik();
	System.out.println(mobile.phoneImea());
	System.out.println(mobile.getBrand());
	System.out.println(mobile.phoneSymbol());
	System.out.println(mobile.getPrice(2));
}
}
