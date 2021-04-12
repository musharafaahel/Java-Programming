import college.Course;
import department.Faculty;

class PackageDemo
{
	public static void main(String[] args)
	{
		Course c1 = new Course("Comuter Science", "II Year");
		c1.display();
		Faculty f1 = new Faculty("Akbar Basha","Java Programming");
		f1.display();
	}
}