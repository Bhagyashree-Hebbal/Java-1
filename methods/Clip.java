//task-2 7-8-24


class Clip
{
	String color="Yellow";
	String type;
	
	public Clip(String color,String type)
	{
		this.color=color;
		this.type=type;
		System.out.println("created clip using string const");
	}
	
	public void details()
	{
		System.out.println("color:"+this.color);
		System.out.println("type:"+this.type);
	}
}