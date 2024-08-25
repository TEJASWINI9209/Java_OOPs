// It is not  possible to override if the overriden method access level and overriding methods access level is in decreasing order

class Parent
{
	public void m1(){
		System.out.println("Inside Parent method");
	}
}
class Child extends Parent
{
	protected void m1(){
		System.out.println("Inside Child  method");
	}
}
class Example4
{
	public static void main(String[] args) 
	{
		Parent p =new Child();
		p.m1();
	}
}

