class SquareRoot
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

class SquareRootMain
{
	public static void main(String[] args)
	{
		SquareRoot sr = new SquareRoot();
		int a = sr.square(2);
		System.out.println("Square root of 2 : "+ a);
		double b = sr.square(2.5);
		System.out.println("Square root of 2.5 : "+ b);
	}	
}