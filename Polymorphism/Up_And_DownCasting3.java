// direct downcasting is not possible
class Parent
{
	int a=10;
	void m1(){
		System.out.println("inside m1 method "+a);
	}
}
class Child extends Parent
{
	float b=20.5f;
	void m2(){
		System.out.println("inside m2 method "+b);
	}
}
class Up_And_DownCasting3
{
	public static void main(String[] args) 
	{
		Child c=new Parent();
		c.m2();
	}
}
