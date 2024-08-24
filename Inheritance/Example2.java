class Demo
{
	static int x=10;
	static void m1(){
		System.out.println("Inside m1 method");
	}
}
class Sample extends Demo
{
	
}
class Example2 
{
	public static void main(String[] args) 
	{
		Sample.a;
		Sample.m1();
	}
}


// static memebers are also involved & the part of inheritance 