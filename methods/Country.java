//1st task 15-7-24


class Country 
{
	public static void states(String[] states)
	{
		System.out.println("Start states in country");
		for(int total=0;total<states.length;total++)
		{
			String ref=states[total];
		    System.out.println("states:"+ref);
		}
		System.out.println("End states in country");
	}
	
	public static void pincode(int[] pincode)
	{
		System.out.println("Start pincode in country");
		for(int code=0;code<pincode.length;code++)
		{
			int ref=pincode[code];
			System.out.println("pincode:"+ref);
		}
		System.out.println("End pincode in country");
	}
	
	public static void primeMinister(String[] minister)
	{
		System.out.println("Start PrimeMinister in country");
		for(int mini=0;mini<minister.length;mini++)
		{
			String ref=minister[mini];
			System.out.println("PrimeMinister:"+ref);
		}
		System.out.println("End PrimeMinister in country");
	}
	
	public static void cabinetMinister(String[] minister)
	{
		System.out.println("Start cabinetMinister in country");
		for(int minister1=0;minister1<minister.length;minister1++)
		{
			String ref=minister[minister1];
			System.out.println("CabinetMinisters:"+ref);
		}
		System.out.println("End CabinetMinisters in country");
	}
	
	public static void politicalParties(String[] parties)
	{
		System.out.println("Start politicalParties in country");
		for(int political=0;political<parties.length;political++)
		{
			String ref=parties[political];
			System.out.println("PoliticalParties:"+ref);
		}
		System.out.println("End politicalParties in country");
	}
	
	
	
	
	
	
	
//1st task 16-7-24
    public static void statesBackward(String[] states)
	{
		System.out.println("Start statesbackward in country");
		for(int total=states.length-1;total>=0;total--)
		{
		    System.out.println(states[total]);
		}
		System.out.println("End statesbackward in country");
	}
	
	public static void pincodeBackward(int[] pincode)
	{
		System.out.println("Start pincodeBackward in country");
		for(int code=pincode.length-1;code>=0;code--)
		{
			System.out.println(pincode[code]);
		}
		System.out.println("End pincodeBackward in country");
	}
	
	public static void primeMinisterBackward(String[] minister)
	{
		System.out.println("Start PrimeMinisterBackward in country");
		for(int mini=minister.length-1;mini>=0;mini--)
		{
			System.out.println(minister[mini]);
		}
		System.out.println("End PrimeMinisterBackward in country");
	}
	
	public static void cabinetMinisterBackward(String[] minister)
	{
		System.out.println("Start cabinetMinisterBackward in country");
		for(int minister1=minister.length-1;minister1>=0;minister1--)
		{
			System.out.println(minister[minister1]);
		}
		System.out.println("End CabinetMinistersBackward in country");
	}
	
	public static void politicalPartiesBackward(String[] parties)
	{
		System.out.println("Start politicalPartiesBackward in country");
		for(int political=parties.length-1;political>=0;political--)
		{
			System.out.println(parties[political]);
		}
		System.out.println("End politicalPartiesBackward in country");
	}
}