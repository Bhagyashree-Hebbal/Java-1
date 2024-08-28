//task-1 7-8-24


class Key
{
	double weight;
	String brand;
	
	public Key(double weight,String brand)
	{
		this.weight=weight;
		this.brand=brand;
		System.out.println("created key using double,string const");
	}
	
	public void details()
	{
		System.out.println("weight:"+weight);
		System.out.println("brand:"+brand);
	}
}