 abstract class Demo1
 {
	 abstract void m1();
 }
 class Sample1 extends Demo1
 {
	 void m1(){
		System.out.println("inside m1 method-Sample1");
	 }
 }
 abstract class Example9
{
	public static void main(String[] args) 
	{
		Demo1 d=new Sample1();
		d.m1();
	}
}