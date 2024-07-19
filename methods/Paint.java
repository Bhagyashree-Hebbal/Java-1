//1st Task- 2-7-24


class Paint 
{
    public static void sketch(String brand)
	{
		System.out.println("Running sketch in brand with string parameter");
		System.out.println("Brand:" +brand);
	}
    public static void sketch(String brand,String color)
	{
		System.out.println("Running sketch in brand and color with string parameter");
		System.out.println("Brand:" +brand);
		System.out.println("Color:" +color);
	}
    public static void sketch(String brand,double price)
	{
		System.out.println("Running sketch in brand and price with string and double parameter");
		System.out.println("Brand:" +brand);
		System.out.println("Price:" +price);
	}
    public static void sketch(String color,String type,double price)
	{
		System.out.println("Running sketch in brand and price with string and double parameter");
		System.out.println("Color:" +color);
		System.out.println("Type:" +type);
		System.out.println("Price:" +price);
	}
}