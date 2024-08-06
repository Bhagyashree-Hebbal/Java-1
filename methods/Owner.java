class Owner 
{
	String name;
	int age;
	char gender;
	Owner(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		System.out.println("created Owner using string,age,char");
	}
	public void print()
	{
		System.out.println("Owner name:"+this.name);
		System.out.println("Owner age:"+this.age);
		System.out.println("Owner gender:"+this.gender);
	}
}