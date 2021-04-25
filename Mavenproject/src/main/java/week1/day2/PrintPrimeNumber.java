package week1.day2;

public class PrintPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print prime numbers within 0 to 25
		int count =0;	
		int total=0;
		for (int i = 2; i <= 25; i++) {
			for (int j = 2; j<=i; j++) {
			
				if(i%j==0){
					total=count+1;
					continue;
				}
			
			if(total>2) {
				System.out.println(i + " is not a prime number");
	}
				else 
				System.out.println(i +" is a prime number");

		}
}
}
	
	
}
	
		
			
