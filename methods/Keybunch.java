//task-1 7-8-24


class Keybunch
{
	String material;
	Key key;
	
	public Keybunch(String material,Key key)
	{
		this.material=material;
		this.key=key;
		System.out.println("created keybunch using string,key const");
	}
	
	public void details()
	{
		System.out.println("Start details in Keybunch");
		System.out.println("material:"+material);
		key.details();
		System.out.println("End details in Keybunch");
	}
}