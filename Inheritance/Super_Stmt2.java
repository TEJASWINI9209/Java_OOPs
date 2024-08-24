/* super() stmt should be the first line within the constructor. 
If we do not add the super() stmt bydefault compilar will add the zero arg default super tmt */ 
class Cyber
{
	Cyber(){
		System.out.println("Inside cyber Constructor");
	}
} 

class Success extends Cyber
{
	Success(){
		System.out.println("	Inside Success Constructor");
		super();
	}
}
class Super_Stmt2 
{
	public static void main(String[] args) 
	{
		Success s1=new Success();

	}
}
