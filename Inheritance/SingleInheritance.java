class Parent
{
	int a=100;
}
class Child extends Parent
{
	float b=200.5f;
}
class  SingleInheritance
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Parent p=new Parent();
		System.out.println(p.a);
		Child c1=new Child();
		System.out.println(c1.b);
		System.out.println(c1.a);  // accessing parent class member
		System.out.println("Stop");
	}
}
