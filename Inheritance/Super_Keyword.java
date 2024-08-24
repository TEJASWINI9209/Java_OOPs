class Demo
{
	int x=100;
	float y= 200.5f;
}
class Sample extends Demo
{
	int x=10;
	float y=20.5f;
	void m1(int x, float y){
		System.out.println("inside m1 method");
		System.out.println(x+y);
		System.out.println(this.x+this.y);
		System.out.println(super.x+super.y);
	}
}
class Super_Keyword 
{
	public static void main(String[] args) 
	{
		Sample s=new Sample();
		s.m1(1000,2000f);	
	}
}
