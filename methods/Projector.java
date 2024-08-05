class Projector
{
	String company;
	String type;
	String color;
	double weight=2.3;
	
	public Projector(String company)
	{
		this.company=company;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public void display()
	{
		System.out.println("company:"+company);
		System.out.println("type:"+type);
		System.out.println("color:"+color);
		System.out.println("weight:"+weight);
	}
}