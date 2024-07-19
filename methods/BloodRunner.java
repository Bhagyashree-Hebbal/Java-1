//1st task- 8/7/24


class BloodRunner
{
    public static void main(String[] blood)
	{
		System.out.println("running main in BloodRunner");
		String alphabets=Blood.group();
		System.out.println("group return type:"+alphabets);
		
		String name=Blood.personName();
		System.out.println("personName return type:"+name);
		
		double price=Blood.cost();
		System.out.println("cost return type:"+price);
		
		boolean ref=Blood.hospitalTested();
		System.out.println("hospitalTested return type:"+ref);
		
		boolean health=Blood.sickness();
		System.out.println("sickness return type:"+health);
		
		boolean organ=Blood.donate();
		System.out.println("donate return type:"+organ);
	}
}