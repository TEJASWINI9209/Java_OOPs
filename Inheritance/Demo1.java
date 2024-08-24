/* The Parent class Constructors are not part of Inheritance because
   if they are inherited it will violet the rule no 1 hence Constructors are not part of Inhritance */

class Cyber
{
	Cyber(){
		System.out.println("Inside cyber Constructor");
	}
} 

class Success extends Cyber
{
	Success(){
		super();    // call parent const
		System.out.println("Inside Success Constructor");
	}
}
class Demo1 
{
	public static void main(String[] args) 
	{
		Success s1=new Success();

	}
}
