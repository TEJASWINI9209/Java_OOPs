
class Example3
{
	Example3(int x){
		System.out.println("inside Int arg Constructor");
	}
	Example3(char c){
		System.out.println("inside Char arg Constructor");
	}
	Example3(boolean y){
		System.out.println("inside Boolean arg Constructor");
	}
	public static void main(String[] args) 
	{
		Example3 ref=new Example3(true);
	}
}
