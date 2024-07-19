//1st task 4-7-24


class Ticket
{
    public static void location(String brand,double price)
	{
	    System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
	}
	public static void product(double quantity,String quality)
	{
	    System.out.println("Quantity:"+quantity);
		System.out.println("Quality:"+quality);
	}
	public static void details(String name,String email)
	{
	    System.out.println("Name:"+name);
		System.out.println("Email:"+email);
	}
	public static void person(char gender,double height,float weight)
	{
	    System.out.println("Gender:"+gender);
		System.out.println("Height:"+height);
		System.out.println("Weight:"+weight);
	}
	public static void address(int pincode,String street,String city,String state)
	{
	    System.out.println("Pincode:"+pincode);
		System.out.println("Street:"+street);
		System.out.println("City:"+city);
		System.out.println("State:"+state);
	}
}