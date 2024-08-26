class Hdfc
{
	private int custAccNum;
	private float amtBal;
	private String custName;
	Hdfc(int custAccNum, float amtBal, String custName){
		this.custAccNum=custAccNum;
		this.amtBal=amtBal;		
		this.custName=custName;
		
		System.out.println("Welcome to the HDFC Bank, Your Account is successfully opened!");
	}
	public float getAmtBal(){
		return amtBal;
	}
	public void setAmtDeposit(int amtDeposit){
		amtBal=amtBal+amtDeposit;
		System.out.println("Amount Deposit "+amtBal+" is successful");
	}
} 
class Example2 
{
	public static void main(String[] args) 
	{
		Hdfc cust1=new Hdfc(12345,5000,"Rahul");
		float cust1MobView=cust1.getAmtBal();
		System.out.println("your Account Balance is "+cust1MobView);
		cust1.setAmtDeposit(7000);
		cust1MobView=cust1.getAmtBal();
		System.out.println("your Account Balance is "+cust1MobView);
	}
}
