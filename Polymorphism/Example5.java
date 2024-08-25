// variables are not part of overriding but they still part of inheritance
class Parent
{
	int a=100;
}
class Child extends Parent
{
	int a=200;
}
class Example5
{
	public static void main(String[] args) 
	{
		Parent p =new Child();
		System.out.println(p.a);
	}
}

