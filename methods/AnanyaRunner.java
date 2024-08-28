//task-3 7-8-24


class AnanyaRunner
{
	public static void main(String[] args)
	{
		Knife knife=new Knife(10,10);
		Ananya ananya=new Ananya(658423451,knife);
		ananya.details();
		
		System.out.println("=============================");
		
		Knife knife1=new Knife(20,10);
		Ananya ananya1=new Ananya(984642314,knife1);
		ananya1.details();
	}
}