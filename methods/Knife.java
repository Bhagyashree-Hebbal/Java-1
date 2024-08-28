//task-3 7-8-24


class Knife
{
	double weight;
	double height;
	
	public Knife(double weight,double height)
	{
		this.weight=weight;
		this.height=height;
		System.out.println("created Knife using double const");
	}
	
	public void details()
	{
		System.out.println("weight:"+weight);
		System.out.println("height:"+height);
	}
}