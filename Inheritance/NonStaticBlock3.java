
class Cyber
{
	{
		System.out.println("Inside Cyber Non-Static block ");
	}
	Cyber(){
		System.out.println("Inside cyber Constructor ");
	}

} 

class Success extends Cyber
{

}
class NonStaticBlock3 
{
	public static void main(String[] args) 
	{
		new Success();

	}
}
