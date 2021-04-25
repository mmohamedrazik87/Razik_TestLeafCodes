package week1.homeWork;

public class stringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name";
		int strlen= str.length()-1;
		System.out.println(strlen);;
		System.out.println("****************************");
		
		
		int dup =54321;
		int leng=Integer.toString(dup).length();
		System.out.println(leng);
		System.out.println("****************************");
		

		String str1 ="MY WORLD IS HAPPY";
		String[] splitString= str1.split(" ");
		for (int i = 0; i < splitString.length; i++) {
			System.out.println(splitString[i]);
			System.out.println(splitString[i].length());
		}
			}}
