
class A
{
	int a=10;
	void m1(){
		System.out.println("inside m1 method "+a);
	}
}
class B extends A
{
	float b=20.5f;
	void m2(){
		System.out.println("inside m2 method "+b);
	}
}
class C extends B
{
	char c='x';
	void m3(){
		System.out.println("inside m3 method "+c);
	}

}
class Up_And_DownCasting4
{
	public static void main(String[] args) 
	{
		//upcasting
		B b1=new C();
		b1.m2();
		b1.m1();
		System.out.println("------------------------------------");
		A a1=(A)b1;
		a1.m1();
		System.out.println("------------------------------------");
	     C c1=(C)a1;
		 c1.m3();
		 c1.m2();
		 c1.m1();



	}
}
