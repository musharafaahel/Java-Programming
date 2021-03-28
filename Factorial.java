/* Recursion Factorial */

class Factorial
{
	public static void main(String args[])
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Factorial of "+i+" = "+fact(i));
		}
	}
	static int fact(int n)
	{
		if(n==1)
		   return 1;
		return n * fact(n-1);
	}
}