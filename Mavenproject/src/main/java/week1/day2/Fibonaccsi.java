package week1.day2;

public class Fibonaccsi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int n3;
		int	count=20;
		System.out.print(n1+ " "+n2);
	
	for (int j = 2; j <count ; j++) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(" "+n3);
		
	}
		
}

}
