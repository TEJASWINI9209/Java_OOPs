class Parent
{
	int a=100;
}
class Child extends Parent
{
	float b=200.5f;
}
class  Example1 extends Parent, Child     // Multiple class can not be inherited at a time
{
	public static void main(String[] args) 
	{
		System.out.println("Start");

		System.out.println("Stop");
	}
}
