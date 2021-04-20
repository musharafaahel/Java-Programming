class MarkException extends Exception
{
	MarkException(String message)
	{
		super(message);
	}
}

class TestMarkException
{
	public static void main(String args[])
	{
		int mark = 500;
		try
		{
			if(mark < 0 || mark > 100)
			{
				throw new MarkException("No mark");
			}
		}
		catch(MarkException e)
		{
			System.out.println(e.getMessage());
		}
	}
}