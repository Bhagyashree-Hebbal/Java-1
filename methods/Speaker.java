class Speaker
{
	String brand;
	String size;
	double cost;
	String output="Sound";
	
	public Speaker(String size)
	{
		this.size=size;
	}
	public void setCost(double cost)
	{
		this.cost=cost;
	}
	public void display()
	{
		System.out.println("Brand:"+brand);
		System.out.println("size:"+size);
		System.out.println("cost:"+cost);
		System.out.println("output:"+output);
	}
}