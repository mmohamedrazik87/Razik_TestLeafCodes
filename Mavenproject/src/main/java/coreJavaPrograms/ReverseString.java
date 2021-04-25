package coreJavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		
		char[] eachChar = s.toCharArray();
		int lengthOfChar = eachChar.length;

		for (int i = lengthOfChar-1; i>= 0; i--) {

			System.out.print(eachChar[i]);
		}
		
		System.out.println("******************************");
		
		String rev="";
		
		for (int i = lengthOfChar-1; i>= 0; i--) {
			
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
		System.out.println("******************************************");
		
		StringBuffer  string = new StringBuffer(s);
		System.out.println(string.reverse());
		
		System.out.println("******************************************");
		StringBuilder builder = new StringBuilder(s);
		System.out.println(builder.reverse());
				

	}
}
