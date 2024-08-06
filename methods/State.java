class State
{
	String name;
	String language; 
	CapitalCity capitalCity=new CapitalCity();
	
	State(String name,String language)
	{
		this.name=name;
		this.language=language;
		System.out.println("created state using String const");
	}
	public void print()
	{
		System.out.println("state name:"+name);
		System.out.println("state language:"+language);
		this.capitalCity.print();
	}
}