// Constructor name should remain the same can have name number of agruments
//  Constructor name should remain the same but should vary in the no of arguments.

class Example1 
{
	Example1(){
		System.out.println("inside 0 arg Constructor");
	}
	Example1(char c){
		System.out.println("inside 1 arg Constructor");
	}
	public static void main(String[] args) 
	{
		Example1 ref=new Example1('A');
	}
}
