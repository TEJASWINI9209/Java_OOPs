/* It is possible to override if The parent method return  type as well as Child method return type is different at class level */
 // COVARIANT
class Demo
{
	Demo m1(){
		System.out.println("Inside m1 method- Demo");
		 Demo d=new Demo();
		 return d;
	}
}
class Sample extends Demo
{
	Sample m1(){
		System.out.println("Inside m1 method- Sample");
		// Sample s=new Sample();
		// return s;
		return new Sample();
	}
}
class Example5 
{
	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		s1.m1();
	}
}
