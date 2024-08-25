/* To acheive overriding the parent class method signiture and the
child class method signiture should be same  */
class Demo
{
	void m1(){
		System.out.println("Inside m1 method- Demo");
	}
}
class Sample extends Demo
{
	void m1(){
		System.out.println("Inside m1 method- Sample");
	}
}
class Example1 
{
	
	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		s1.m1();
	}
}
