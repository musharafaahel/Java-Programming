/*Method Overloading*/

class MethodOverload
{
	int square(int x)
	{
		return x * x;
	}
	double square(double x)
	{
		return x * x;
	}
}

class MethodOverloadDemo
{
	public static void main(String args[])
	{
		MethodOverload ob1 = new MethodOverload();
		int a = ob1.square(2);
		double b = ob1.square(4.0);
		System.out.println("Square of 2 = "+a);
		System.out.println("Square of 4.0 = "+b);
	}
}