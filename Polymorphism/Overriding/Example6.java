/* It is not possible to override final method*/
class Demo
{
	final void m1(){
		System.out.println("Inside m1 method- Demo");
	}
}
class Sample extends Demo
{
	void m1(){
		System.out.println("Inside m1 method- Sample");
	}
}
class Example6 
{
	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		s1.m1();
	}
}
