class AeroplaneRunner
{
	public static void main(String[] args)
	{
		Aeroplane aeroplane1=new Aeroplane();
		System.out.println("Aeroplane company:"+aeroplane1.company);
		System.out.println("Aeroplane noOfSeats:"+aeroplane1.noOfSeats);
		System.out.println("Aeroplane ticketPrice:"+aeroplane1.ticketPrice);
		System.out.println("Aeroplane source:"+aeroplane1.source);
		System.out.println("Aeroplane destination:"+aeroplane1.destination);
		
		System.out.println("=========================================");
		
		Aeroplane aeroplane2=new Aeroplane("Air India","India","USA");
		System.out.println("Aeroplane company:"+aeroplane2.company);
		System.out.println("Aeroplane source:"+aeroplane2.source);
		System.out.println("Aeroplane destination:"+aeroplane2.destination);
		
	    System.out.println("=========================================");

        Aeroplane aeroplane3=new Aeroplane("Air India",200000,"India","USA");
		System.out.println("Aeroplane company:"+aeroplane3.company);
		System.out.println("Aeroplane ticketPrice:"+aeroplane3.ticketPrice);
		System.out.println("Aeroplane source:"+aeroplane3.source);
		System.out.println("Aeroplane destination:"+aeroplane3.destination);
	}
}