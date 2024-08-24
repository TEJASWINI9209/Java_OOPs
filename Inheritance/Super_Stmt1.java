// In the default, zero arg, empty implimantation constructor the super() stmt is set bydefault by compilar 
class Cyber
{
	Cyber(){
		System.out.println("Inside cyber Constructor");
	}
} 

class Success extends Cyber
{

}
class Super_Stmt1
{
	public static void main(String[] args) 
	{
		Success s1=new Success();

	}
}
