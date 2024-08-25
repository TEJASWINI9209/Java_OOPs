/* It is possible to override if The parent method return  type & Child method return type is same at class level */

class Cyber
{
}
class Demo
{
	Cyber m1(){
		System.out.println("Inside m1 method- Demo");
		// Cyber c=new Cyber();
		// return c;
		return new Cyber();
	}
}
class Sample extends Demo
{
	Cyber m1(){
		System.out.println("Inside m1 method- Sample");
		// Cyber c=new Cyber();
		// return c;
		return new Cyber();
	}
}
class Example4 
{
	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		s1.m1();
	}
}
