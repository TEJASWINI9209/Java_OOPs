class Parent extends Child
{
	int a=100;
	void m1(){
	System.out.println("Inside m1 mthod "+a);
	}
}
class Child extends Parent
{
	float b=200.5f;
	void m2(){
	System.out.println("Inside m2 mthod "+b);
	}
}
class Cyclic_Inheritance 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Child c1=new Child();
		c1.m2();
		System.out.println("Stop ");
	}
}

// Cyclic Inheritance cannot supported by java