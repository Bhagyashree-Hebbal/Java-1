//2nd Task- 2-7-24


class Train
{
    public static void book(String source,String destination)
	{
		System.out.println("Running book in source and destination with string parameter");
		System.out.println("Source:" +source);
		System.out.println("Destination:" +destination);
	}
	public static void book(String source,String destination,int quantity)
	{
		System.out.println("Running book in source,destination and quantity with string and int parameter");
		System.out.println("Source:" +source);
		System.out.println("Destination:" +destination);
		System.out.println("Quantity:" +quantity);
	}
	public static void book(String source,String destination,int quantity,double price)
	{
		System.out.println("Running book in source,destination,quantity and price with string,int and double parameter");
		System.out.println("Source:" +source);
		System.out.println("Destination:" +destination);
		System.out.println("Quantity:" +quantity);
		System.out.println("Price:" +price);
	}
	public static void cancel(int ticketNo)
	{
		System.out.println("Running cancel in ticketNo with int parameter");
		System.out.println("TicketNo:" +ticketNo);
	}
	public static void cancel(String source,String destination)
	{
		System.out.println("Running cancel in source and destination with string parameter");
		System.out.println("Source:" +source);
		System.out.println("Destination:" +destination);
	}
}