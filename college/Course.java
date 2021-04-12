package college;

public class Course
{
	String dept, year;
	public Course(String d, String y)
	{
		dept = d;
		year = y;
	}
	public void display()
	{
		System.out.println("Department : "+dept);
		System.out.println("Year : "+year);
	
	}
}

