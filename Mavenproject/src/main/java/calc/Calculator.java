package calc;

public class Calculator {
	
	public int add (int a, int b) {
			
		return  a+b;
	}
	
	public int add (int a, int b, int c) {
		
		return a+b+c;
	}
	public int multiply (int a, int b) {
		
		return a*b;
	}
	public double multiply (int a, double b) {
		
		return a*b;
	}

	public int subtract (int a, int b) {
		
		return a-b;
	}
	public double subtract (double a, double b) {
		
		return a-b;
	}
	public int divide (int a, int b) {
		
		return a/b;
	}
	public double divide (double a, int b) {
		
		return a/b;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(1, 3);
		calc.add(5, 5, 6);
		calc.multiply(150, 11453);
		calc.multiply(10, 92.5);
		calc.divide(500, 10);
		calc.divide(15000, 15);
		calc.subtract(900, 99);
		calc.subtract(100000, 49489);
	}
	
}
