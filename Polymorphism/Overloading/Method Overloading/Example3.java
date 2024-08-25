class Example3 
{
	void m1(float b){
		System.out.println("Inside m1 method Float arg");
	}
	void m1(int a){
		System.out.println("Inside m1 method Int arg");
	}
	void m1(){
		System.out.println("Inside m1 method  0 arg");
	}
	public static void main(String[] args) 
	{
		Example3 ref=new Example3();
		ref.m1(10.0f);
	}
}
