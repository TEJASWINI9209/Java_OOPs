/* To call the parent class variable we use super keyword and to call the parent class constructor we use super() stmt */
class Cyber
{
	int a=10;
	Cyber(){
		System.out.println("Inside cyber Constructor");
	}
} 

class Success extends Cyber
{
	int a=100;
	Success(){
		super();
		System.out.println("Inside Success Constructor");
		System.out.println(a);
		System.out.println(super.a);
	}
}
class Super_Stmt3
{
	public static void main(String[] args) 
	{
		Success s1=new Success();

	}
}
