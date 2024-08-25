// Method name should be remain same but should vary in number of args

class Example1 
{
	void m1(){
		System.out.println("Inside m1 method 0 arg");
	}
	void m1(int a){
		System.out.println("Inside m1 method 1 arg");
	}
	public static void main(String[] args) 
	{
		Example1 ref=new Example1();
		ref.m1(10);
	}
}
