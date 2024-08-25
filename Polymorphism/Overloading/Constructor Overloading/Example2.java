/*Constructor name should remain the same can have name number of agruments
  but should vary in their types */

class Example2
{
	Example2(int x){
		System.out.println("inside Int arg Constructor");
	}
	Example2(char c){
		System.out.println("inside Char arg Constructor");
	}
	public static void main(String[] args) 
	{
		Example2 ref=new Example2(0);
	}
}
