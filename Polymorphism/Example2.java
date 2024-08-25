// It is possible to override if the overriden method access level and overridind methos access level is same

class Parent
{
	public void m1(){
		System.out.println("Inside Parent method");
	}
}
class Child extends Parent
{
	public void m1(){
		System.out.println("Inside Child  method");
	}
}
class Example2 
{
	public static void main(String[] args) 
	{
		Parent p =new Child();
		p.m1();
	}
}

