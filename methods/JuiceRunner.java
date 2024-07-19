//2nd task 17-7-24


class JuiceRunner
{
	public static void main(String[] args)
	{
		if(args.length==5)
		{
			String name=args[0];
			String brand=args[1];
			String flavour=args[2];
			String price=args[3];
			String quantity=args[4];
			double convertedPrice=Double.parseDouble(price);
			int convertedQuantity=Integer.parseInt(quantity);
			
			Juice.juiceInformation(name,brand,flavour,convertedPrice,convertedQuantity);
		}
		else
		{
			System.out.println("5 args required");
		}
	}
}