/* The parent methods signiture type and Child method signiture type should be same at primitive level
   only then it is possible to override */
class Demo
{
	int m1(){
		System.out.println("Inside m1 method- Demo");
		return 10;
	}
}
class Sample extends Demo
{
	int m1(){
		System.out.println("Inside m1 method- Sample");
		return 20;
	}
}
class Example2 
{
	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		s1.m1();
	}
}
,