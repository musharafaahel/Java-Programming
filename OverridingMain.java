class College
{
	void display()
	{
		System.out.println("The New College");
	}
}

class Department extends College
{
	
	void display()
	{
		super.display();
		System.out.println("Computer Science");
	}
}

class OverridingMain
{
	public static void main(String args[])
	{
		Department d = new Department();
		d.display();
	}
}