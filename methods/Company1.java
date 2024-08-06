class Company1
{
	int id;
	String name;
	String location;
	SoftwareEnginner softwareEnginner=new SoftwareEnginner("Bhagyashree",0,"Developer",50000);
	
	Company1(int id,String name,String location)
	{
		this.id=id;
		this.name=name;
		this.location=location;
		System.out.println("created software enginner using String");
	}
	public void print()
	{
		System.out.println("Company1 id:"+this.id);
		System.out.println("Company1 name:"+this.name);
		System.out.println("Company1 location:"+this.location);
		this.softwareEnginner.print();
	}
}