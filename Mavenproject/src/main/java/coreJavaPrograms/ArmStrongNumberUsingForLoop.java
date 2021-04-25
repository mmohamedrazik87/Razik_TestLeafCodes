package coreJavaPrograms;

public class ArmStrongNumberUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =153;
		int temp = input;
		int rem;
		int arm =0;
		
		for (int i = 153; temp>0 ;  temp=temp/10) {
			
			rem=temp%10;
			arm = arm+(rem*rem*rem);
			temp=temp/10;
				
			
		}
		if (input == arm) {
		System.out.println(input + " is an ARM Strong Number");
	}
		else {
			System.out.println(input + " is NOT an ARM Strong Number");
		}

	}

}
