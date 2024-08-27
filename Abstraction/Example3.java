// We cannot create an object of abstract class
 abstract class Sample
 {
	 abstract void m1();
	 void m2(){
		System.out.println("Inside m2 method");
	 }
 } 
 
 class Example3 //extends Sample
{
	public static void main(String[] args) 
	{
		Sample s=new Sample();
	}
}
