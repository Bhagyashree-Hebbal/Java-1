//task-1 7-8-24


class KeybunchRunner
{
	public static void main(String[] args)
	{
		Key key=new Key(10,"wolpin");
		Keybunch keybunch=new Keybunch("rubber",key);
		keybunch.details();
		
		System.out.println("=============================");
		
		Key key1=new Key(20,"SNDIA");
		Keybunch keybunch1=new Keybunch("Plastic",key1);
		keybunch1.details();
	}
}