package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 =1;
		int n2 =2;
		int n3;
		int input=9;
		System.out.print(n1+" " +n2);
		
		for (int i = 2; i < input; i++) {
			n3=n1*n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
