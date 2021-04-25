package coreJavaPrograms;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 370;
		int temp = input;
		int arm = 0;
		int rem = 0;

		while (temp > 0) {
			// 3 = 153%10

			rem = temp % 10;
			// 27= 0+(3*3*3)
			arm = arm + (rem * rem * rem);
			// 15=153/10
			temp = temp / 10;
			// temp became 15
			// check 15>0

		}

		if (input == arm) {
			System.out.println(input + " is an armstrong number");
		} else
			System.out.println(input + " is NOT an armstrong number");

	}

}
