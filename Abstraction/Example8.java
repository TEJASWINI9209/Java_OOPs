 abstract class Demo1
 {
	 abstract void m1();
	 void m2(){
		System.out.println("inside m2 method-Demo1");
	 }
 }
 class Sample1 extends Demo1
 {
	 void m1(){
		System.out.println("inside m1 method-Sample1");
	 }
	 void m3(){
		System.out.println("inside m3 method-Sample1");
	 }
 }
 abstract class Example8
{
	public static void main(String[] args) 
	{
		Demo1 d=new Sample1();
		d.m1();
		d.m2();
		//d.m3();
	}
}
