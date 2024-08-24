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

class C extends A
{
	char c='x';	
	void m3(){
		System.out.println("Inside m3 method "+c);
		
		
	}
}

class D extends A
{
	boolean d= true;	
	void m4(){
		System.out.println("Inside m4 method "+d);
	}
}
class  Hirarchial_Inheritance
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		A a1=new A();
		a1.m1();
		System.out.println("-------------------------------------------");

		B b1=new B();
		b1.m2();
		b1.m1();
		System.out.println("-------------------------------------------");


		C c1=new C();
		c1.m3();
		c1.m1();
		System.out.println("-------------------------------------------");


		D d1=new D();
		d1.m4();
		d1.m1();
		System.out.println("-------------------------------------------");

		
		System.out.println("Stop");
	}
}
