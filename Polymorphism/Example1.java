// If the method is made as private it is not possible to override

class Parent
{
	private void m1(){
		System.out.println("Inside Parent method");
	}
}
class Child extends Parent
{
	void m1(){
		System.out.println("Inside Child  method");
	}
}
class Example1 
{
	public static void main(String[] args) 
	{
		Parent p =new Child();
		p.m1();
	}
}
