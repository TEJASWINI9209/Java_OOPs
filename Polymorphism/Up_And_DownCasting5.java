// Without the concept of iverriding only then it is possible to acheive upcastingg and downcastind.
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
class Demo 
{
	static void test(A a1){
		System.out.println("inside test method ");
		a1.m1();
	}
}
class Up_And_DownCasting5
{
	public static void main(String[] args) 
	{
		Demo.test(new B());

	}
}
