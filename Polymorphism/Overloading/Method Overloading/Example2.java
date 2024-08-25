//Method name should be remain same. can have same number of arguments but different types

class Example2 
{
	void m1(float b){
		System.out.println("Inside m1 method Float arg");
	}
	void m1(int a){
		System.out.println("Inside m1 method Int arg");
	}
	public static void main(String[] args) 
	{
		Example2 ref=new Example2();
		ref.m1(200);
	}
}
