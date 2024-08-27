// we can create Constructor in abstract class
 abstract class Demo1
 {
	 Demo1(){
		System.out.println("inside 0 arg Demo1 Const");
	 }
 }
 class Sample1 extends Demo1
 {
	 Sample1()
	 {
		 super();
		System.out.println("inside Sample1 Const");
	 }
 }
 class Example10
{
	public static void main(String[] args) 
	{
		new Sample1();
	}
}