package week1.day2;
//
public class FizBiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 25; i++) {
			if (i%3==0&& i%7==0) {
				System.out.println("Number "+i + " is bizfiz");
			}
				else if (i%3==0) {
					System.out.println("Number "+i+" is biz");
					
				}
				else if  (i%7==0) {
					System.out.println("Number "+i+ " is fiz");				
				}
			}
				
		}

	}


	