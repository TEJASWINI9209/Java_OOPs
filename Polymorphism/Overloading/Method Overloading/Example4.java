// Real time use of Method Overloadind

class Flipkart
{
	void payment(){
		System.out.println("logics to buy product using Cash");
	}
	void payment(int creditDebitCard){
		System.out.println("logics to buy product using Credi or Debit Card");
	}
	void payment(String upi){
		System.out.println("logics to buy product using UPI ");
	}
	void payment(float netBanking){
		System.out.println("logics to buy product using NetBanking");
	}
}
class Example4 
{
	public static void main(String[] args) 
	{
		Flipkart cust1=new Flipkart();
		cust1.payment("Mansi");
	}
}
