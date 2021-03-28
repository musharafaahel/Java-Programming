/*Inheritance */

class College
{
	String collegeName, principalName;
	College(String cName, String pName)
	{
		collegeName = cName;
		principalName = pName;
	}
	
	void displayCollege()
	{
		System.out.println("College Name : "+collegeName);
		System.out.println("Principal Name : "+principalName);
	}	
}

class Department extends College
{
	String departmentName, hodName;
	Department(String cName, String pName, String dName, String hName)
	{
		super(cName, pName);
		departmentName = dName;
		hodName = hName;
	}
	
	void displayDepartment()
	{
		System.out.println("Department Name : "+departmentName);
		System.out.println("HOD Name : "+hodName);
	}
}

class CollegeDemo
{
	public static void main(String args[])
	{
		Department d1 = new Department("THE NEW COLLEGE","BASHEER AHAMED","B.Sc Computer Science","Mohammed Hamsa");
		d1.displayCollege();
		d1.displayDepartment();
	}
}