
import java.io.*;
class ThrowsDemo
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter a number : ");
		/*InputStreamReader in = new InputStreamReader(System.in); 
		BufferedReader br = new BifferedReader(in);*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int n = Integer.parseInt(br.readLine());
			System.out.println("Received Value : "+n);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter valued number");
		}
	}
}