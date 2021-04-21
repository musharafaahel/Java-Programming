class Outer
{
	int x = 100;
	
	class Inner
	{
		
		void display()
		{
			System.out.println("Value of x : "+ x);
		}
	}
	void test()
	{
		Inner inner = new Inner();
		inner.display();
	}
}

class NestedClass
{
	public static void main(String args[])
	{
		Outer outer = new Outer();
		outer.test();
	}
}