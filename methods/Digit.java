//1st task 9-7-24


class Digit
{
    public static String code(int country)
	{
		System.out.println("running code in digit");
		System.out.println("Country:"+country);
		if(country==91)
		{
			return "India";
		}
		if(country==61)
		{
			return "Australia";
		}
		if(country==880)
		{
			return "Bangladesh";
		}
		if(country==1)
		{
			return "Canada";
		}
		if(country==49)
		{
			return "Germany";
		}
		System.out.println("No country match");
		return "not found";
	}
	public static double price(String item)
	{
		System.out.println("running price in digit");
		System.out.println("Item:"+item);
		if(item=="Idli")
		{
			return 40;
		}
		if(item=="Doosa")
		{
			return 50;
		}
		if(item=="Paneer butter masala")
		{
			return 150;
		}
		if(item=="Sev puri")
		{
			return 70;
		}
		if(item=="Pani Puri")
		{
			return 80;
		}
		System.out.println("No item match");
		return 0;
	}
	
	
	public static String movieName(String producerName)
	{
		System.out.println("running movieName in digit");
		System.out.println("ProducerName:"+producerName);
		if(producerName=="Manjunath GN Murthy")
		{
			return "Kotte";
		}
		if(producerName=="Vijay Kirgandur")
		{
			return "Raajakumara";
		}
		if(producerName=="Rakshit Shetty")
		{
			return "Kirik Party";
		}
		if(producerName=="Jack Manjunath")
		{
			return "Vikrant Rona";
		}
		if(producerName=="H.K.Prakash")
		{
			return "RangiTaranga";
		}
		System.out.println("No movieName match");
		return "Kaatera";
	}
}