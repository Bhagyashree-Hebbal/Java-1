class Country1
{
	String name;
	String continent;
	State state=new State("Karntaka","kannada");
	
	Country1()
	{
		
	}
	public void print()
	{
		System.out.println("Country1 name:"+name);
		System.out.println("Country1 continent:"+continent);
		this.state.print();
	}
}