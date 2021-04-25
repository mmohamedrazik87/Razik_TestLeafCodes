package coreJavaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 1234;
		int rem = 0;
		while (input > 0) {
			rem = (rem * 10) + input % 10;
			input = input % 10;
		}
		System.out.println(rem);

	}

}
