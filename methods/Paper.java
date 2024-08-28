//task-5 5-8-24


class Paper
{
	int thickness;
	String size;
	String quality="Good";
	String color;
	
	public Paper(int thickness)
	{
		this.thickness=thickness;
	}
	public void setSize(String size)
	{
		this.size=size;
	}
	public void display()
	{
		System.out.println("thickness:"+thickness);
		System.out.println("size:"+size);
		System.out.println("quality:"+quality);
		System.out.println("color:"+color);
	}
}