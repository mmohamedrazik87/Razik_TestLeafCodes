package week1.day2;

public class WhileLoop {

	public static void main(String[] args) {
		int inputNum =155;
		int reminder;
		int quotient;
		int sum=0;
		while (inputNum>0) {
		reminder = inputNum%10;
		quotient = inputNum/10;
		sum = reminder+sum;
		inputNum=quotient;
			
		}
		
	}

}
