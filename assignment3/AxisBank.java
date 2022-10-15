package assignment3;

public class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("child class");
		System.out.println("deposit");
		System.out.println("------");
		super.deposit();
	}
	public static void main(String[] args)
	{
		BankInfo bi= new BankInfo();
		bi.deposit();
		AxisBank ab=new AxisBank();
		System.out.println("------");
		ab.deposit();
		
	}
}
