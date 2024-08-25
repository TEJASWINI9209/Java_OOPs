class Hdfc
{
	Hdfc(String custName, String custAdhaar){
		System.out.println("Opening Saving account for "+custName);
	}
	Hdfc(String custName, String custAdhaar, String companyName){
		System.out.println("Opening current account for "+companyName);
	}
}
class Example4 
{
	public static void main(String[] args) 
	{
		Hdfc cust1=new Hdfc("Tejaswini", "a12b3c4d");
		Hdfc cust2=new Hdfc("Tejaswini", "a12b3c4d5r6u7i", "AgroTech");

	}
}
