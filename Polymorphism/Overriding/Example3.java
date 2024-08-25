/* It is not possible to override The parent method return  type and Child method return 
type is different */
class Demo
{
	int m1(){
		System.out.println("Inside m1 method- Demo");
		return 10;
	}
}
class Sample extends Demo
{
	float m1(){
		System.out.println("Inside m1 method- Sample");
		return 20.5f;
	}
}
class Example3 
{
	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		s1.m1();
	}
}
