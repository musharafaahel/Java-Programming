import java.util.Scanner;
class DaysToSeconds
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		int seconds = days * 24 * 60 * 60;
		System.out.println(days + "Days  is converted into Seconds" + seconds);
	}
}