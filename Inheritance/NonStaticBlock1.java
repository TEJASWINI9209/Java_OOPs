/* Non-Static block are not part of Inheritance */
class Cyber
{
	{
		System.out.println("Inside Cyber Non-Static block");
	}
	Cyber(){
		System.out.println("Inside cyber Constructor");
	}
} 

class Success extends Cyber
{
	{
		System.out.println("Inside Success Non-Static block");
	}
	Success(){
		super();    // call parent const
		System.out.println("Inside Success Constructor");
	}
}
class NonStaticBlock1
{
	public static void main(String[] args) 
	{
		new Success();

	}
}
