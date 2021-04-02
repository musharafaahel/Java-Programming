class Scope
{
	public static void main(String[] args)
	{
		int x ; //Known to all code within main
		x = 10;
		
		if(x == 10)
		{			//Start of new scope
			int y = 20;	//known only to this block
			//both x and y are know here
			System.out.println("x and y = "+ x + " " + y);
			x = y * 2;
		}
		// y =	100;  // y is not known here

		System.out.println("x : "+ x);
	}
}
