/* Static blocks are very closely associated with the class 
  Because they are executed during class loading time  hence they are not part of Inheritance*/
class Cyber
{
	static
	{
		System.out.println("Inside Cyber Static block ");
	}
} 

class Success extends Cyber
{

}
class StaticBlock2
{
	public static void main(String[] args) 
	{
		new Success();

	}
}
