class Parent
{
	int a=10;
}
class Child extends Parent
{
	float b=20.5f;
}
class Up_And_DownCasting1 
{
	public static void main(String[] args) 
	{
		//upcasting
		Parent p=new Child();
		System.out.println(p.a);
		System.out.println("-----------------------------");
		//downcasting
		Child c=(Child)p;
		System.out.println(c.a);
		System.out.println(c.b);

	}
}
