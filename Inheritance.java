class College
{
	String CollegeName, PrincipalName;      //we have declared instance variable.
	College(String cName, String pName) //Declaring methods
	{
		CollegeName = cName;
		PrincipalName = pName;
	}
	void display()    //Declaring methods
	{
		System.out.println("College Name : "+CollegeName);
	 	System.out.println("Principal Name :"+PrincipalName);
	}
}

class Department extends College
{
	String DepartmentName, HodName;      //we have declared instance variable.
	Department(String cName, String pName,String dName, String hName) //Declaring methods
	{
		super(cName, pName);
		DepartmentName = dName;
		HodName = hName;
	}
	void display()    //Declaring methods
	{
		super.display();
		System.out.println("College Name : "+DepartmentName);
	 	System.out.println("Principal Name :"+HodName);
	}
}

class Inheritance
{
	public static void main(String args[])
	{
	
		Department d1 = new Department("The New College","B.S Basheer Ahmed","B.Sc Computer Science","A.S.Mohammed Hamsa");
		d1.display();
	}
}