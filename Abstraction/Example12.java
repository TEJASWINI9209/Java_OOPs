// we can create Constructor in abstract class
 abstract class Demo1
 {
	 Demo1(){
		System.out.println("inside Demo1  0 arg Const");
	 }
	 Demo1(int a){
		this();
		System.out.println("inside Demo1 1 arg Const");
	 }
 }
 class Sample1 extends Demo1
 {
	 Sample1()
	 {
		 this(10); 
		 System.out.println("inside Sample1 0 arg Const");
	 }
	 Sample1(int a)
	 {
		 super(100); 
		 System.out.println("inside Sample1 1 arg Const");
	 }  
 }
 class Example12
{
	public static void main(String[] args) 
	{
		new Sample1();
	}
}