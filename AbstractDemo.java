abstract class JetKings
{
	abstract int noOfComputers();	
}

class TNagar extends JetKings
{
	int noOfComputers()
	{
		return 40;
	}
}

class KKNagar extends JetKings
{
	int noOfComputers()
	{
		return 50;
	}
}

  class AbstractDemo
{
	public static void main(String[] args)
	{
		TNagar t = new TNagar();
		t.noOfComputers();
		System.out.println("No of Computers at T Nagar Branch : "+ t.noOfComputers());
		KKNagar k = new KKNagar();
		k.noOfComputers();
		System.out.println("No of Computers at KK Nagar Branch : "+ k.noOfComputers());
	}
}
