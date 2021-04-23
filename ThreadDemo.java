class A extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("This is i value of A = "+i);
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("This is i value of B = "+i);
		}
	}
}

class ThreadDemo
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		a.start();
		b.start();
	}
}