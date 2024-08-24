 final class Parent
{
	int a=100;
	void m1(){
		System.out.println("Inside m1 method "+a);
	}
}
class Child extends Parent  // error: cannot inherit from final Parent
{
	float b=200.5f;
	void m2(){
	System.out.println("Inside m2 method "+b);
	}
}
class  Final_Keyword3
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
