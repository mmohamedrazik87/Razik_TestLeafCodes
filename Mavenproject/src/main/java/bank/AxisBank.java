package bank;

public class AxisBank extends BankInfo {
	
	public int deposit() {
		System.out.println("Axis Bank has deposit of : ");
		return 60000;
	}
	
	public static void main(String[] args) {
		
		AxisBank bank = new AxisBank();
		System.out.println(bank.deposit());
		System.out.println(bank.saving());
		System.out.println(bank.fixed());
		
		
	}

}
