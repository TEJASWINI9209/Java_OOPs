
class Cyber
{
	int a;
	{
		System.out.println("Inside Cyber Non-Static block "+a);
		a=10;
	}
	Cyber(){
		System.out.println("Inside cyber Constructor "+a);
		a=100;
	}
} 

class Success extends Cyber
{
	{
		System.out.println("Inside Success Non-Static block "+a);
		a=1000;
	}
	Success(){
		super();    // call parent const
		System.out.println("Inside Success Constructor "+a);
	}
}
class NonStaticBlock2 
{
	public static void main(String[] args) 
	{
		new Success();

	}
}
