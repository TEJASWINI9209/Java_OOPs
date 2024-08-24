class Parent1 
{
	int a=100;
	void m1(){
		System.out.println("inside m1 method Parent1 class "+a);
	}
}
class Parent2 
{	
	int a=100;
	void m1(){
		System.out.println("inside m1 method Parent2 class"+a);
	}
}
class Child2 extends Parent1
{	
	Child2 c=new Child2();   // multiple inheritance is not supported by java
		c.m1();
}
class Example3 
{
	public static void main(String[] args) 
	{
		
	}
}
