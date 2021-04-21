class CommandLine
{
	public static void main(String args[])
	{
		System.out.println("Working with Command line arguements");
		System.out.println("Elements received through command line are");
		for(int i = 0; i < args.length; i++)
		{
			System.out.println("	"+args[i]+"	");
		}
	}
}