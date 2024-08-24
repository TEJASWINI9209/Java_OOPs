class A
{
	void test(){
		System.out.println("inside test method-1");
	}
}
class Example4 extends A{
	public static void main(String[] args){
	Example4 ref=new Example4();
	ref.test();
  }
  	void test(){
		System.out.println("inside tesy method-2");
	}
}
