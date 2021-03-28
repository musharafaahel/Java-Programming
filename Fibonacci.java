/*Recursion for fibonnaci series */

class Fibonacci
{
	public static void main(String args[])
	{
		int n = 5;
		for(int i = 1; i <= n; i++)
		{
			System.out.println(" "+fib(i));
		}
	}
	static int fib(int n)
	{
		if(n==0)
		   return 0;
		if(n==1)
		   return 1;
		return fib(n-1) + fib(n-2);
	}
}