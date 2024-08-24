class Final_Keyword1
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		final int a=100;   //error: cannot assign a value to final variable a
		a=200;
		a=300;
		System.out.println(a);
		System.out.println("Stop");
	}
}
