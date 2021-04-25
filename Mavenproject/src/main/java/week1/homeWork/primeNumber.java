package week1.homeWork;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =100;
		int div = 0;
		
		
		for (int i = 2; i <=input; i++) 
			{
			for (int j = 2; j <= i; j++) {
				if(i%j==0) {
					
					div=div+1;
				}
			}
			
			if(div>2) {
						
					System.out.println(i + " is NOT a prime number");
				}
				
			else
				System.out.println(i + " is a prime number");
				
			}
		
		
			
			
		}
}


