class A
{
	int a=100;
	void m1(){
		System.out.println("inside m1 method "+a);
	}
}
class B extends A
{
	float b=200.5f;
	void m2(){
		System.out.println("Inside m2 method "+b);
	}
}

class C extends B
{
	char c='x';	
	void m3(){
		System.out.println("Inside m3 method "+c);
	}
}
class  Multilevel_Inheritance
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		A a1=new A();
		a1.m1();

		B b1=new B();
		b1.m2();
		b1.m1();

		C c1=new C();
		c1.m3();
		c1.m2();
		c1.m1();
		
		System.out.println("Stop");
	}
}
