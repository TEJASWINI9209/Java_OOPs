// Abstract and static keyword together are called as illegal combination
 abstract class Sample1
 {
	 abstract void m1();
	 abstract void m2();
 } 
 abstract class Sample2 extends Sample1
 {
	 void m1(){
		System.out.println("Inside m1 method");
	 }
 }
 class Sample3 extends Sample2
 {
	 void m2(){
		System.out.println("Inside m2 method");
	 }
 }
 class Example5 //extends Sample
{
	public static void main(String[] args) 
	{
		Sample3 ss1=new Sample3();
		ss1.m1();                 
		ss1.m2();
		Sample1 ss2=new Sample3();
		ss2.m1();
		ss2.m2();
	}
}
