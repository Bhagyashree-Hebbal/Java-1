class SoftwareEnginner
{
	String name;
	int experience;
	String designation;
	double salary;
	
	SoftwareEnginner(String name,int experience,String designation,double salary)
	{
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
		System.out.println("created software enginner using String,int,double");
	}
	public void print()
	{
		System.out.println("SoftwareEnginner Name:"+this.name);
		System.out.println("SoftwareEnginner Experience:"+this.experience);
		System.out.println("SoftwareEnginner Designation:"+this.designation);
		System.out.println("SoftwareEnginner Salary:"+this.salary);
	}
}