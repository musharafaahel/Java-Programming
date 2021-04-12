package department;

public class Faculty
{
	String fName, subject;
	public Faculty(String f,String s)
	{
		fName = f;
		subject = s;	
	}
	public void display()
	{
		System.out.println("Faculty : "+fName);
		System.out.println("Subject : "+subject);
	}
}