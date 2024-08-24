/* To call the parent class variable we use super keyword 
And to call the parent class constructor we use super() stmt */
class Cyber
{
	int a=10;
	void m1(){
		System.out.println("Inside Cyber m1 method "+a);
	}
	
} 

class Success extends Cyber
{
	int a=100;
	void m1(){
		System.out.println("Inside Success m1 method "+a);
	}
	void m2(){
		System.out.println("Inside Success m2 method");
		this.m1();  // call Success class m1 method
		super.m1();  // call Cyber class m1 method 
	}
	
}
class Super_Stmt4
{
	public static void main(String[] args) 
	{
		Success s1=new Success();
		s1.m2();

	}
}
