//3rd Task- 2-7-24


class Cloths
{
    public static void company(String brand)
	{
	    System.out.println("Running company in brand with string parameter");
		System.out.println("Brand:" +brand);
	}
	public static void company(String color,String brand)
	{
	    System.out.println("Running company in color and brand with string parameter");
		System.out.println("Color:" +color);
		System.out.println("Brand:" +brand);
	}
	public static void company(String color,double price)
	{
	    System.out.println("Running company in color and price with string and double parameter");
		System.out.println("Color:" +color);
		System.out.println("Price:" +price);
	}
	public static void company(char size)
	{
	    System.out.println("Running company in size with char parameter");
		System.out.println("Size:" +size);
	}
	public static void company(String quality,int quantity)
	{
	    System.out.println("Running company in quality and quantity with string and int parameter");
		System.out.println("Quality:" +quality);
		System.out.println("Quantity:" +quantity);
	}
}