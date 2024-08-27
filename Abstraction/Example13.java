// we can create Constructor in abstract class
 abstract class Demo1
 {
	 {
		System.out.println("inside Demo1 instance block");
	 }
 }
 class Sample1 extends Demo1
 {
	 {
		System.out.println("inside Sample1 instance block");
	 }
 }
 class Example13
{
	public static void main(String[] args) 
	{
		new Sample1();
	}
}