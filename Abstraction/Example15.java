 // We can create variables within abstract class
 abstract class Sample
 {
	int a=20;
 }
 class Example15 extends Sample
{
	public static void main(String[] args) 
	{
		Example15 ref=new Example15();
		System.out.println(ref.a);
	}
}
