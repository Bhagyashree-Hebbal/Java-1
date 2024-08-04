class KeroseneRunner
{
	public static void main(String[] args)
	{
		Kerosene kerosene1=new Kerosene();
		System.out.println("Kerosene price:"+kerosene1.price);
		System.out.println("Kerosene quantity:"+kerosene1.quantity);
		System.out.println("Kerosene quality:"+kerosene1.quality);
		
		System.out.println("=========================================");
		
		Kerosene kerosene8=new Kerosene(2000,4,true);
		System.out.println("Kerosene price:"+kerosene8.price);
		System.out.println("Kerosene quantity:"+kerosene8.quantity);
		System.out.println("Kerosene quality:"+kerosene8.quality);
		
		System.out.println("=========================================");
		
		Kerosene kerosene4=new Kerosene(true);
		System.out.println("Kerosene quality:"+kerosene4.quality);
		
		System.out.println("=========================================");
		
		Kerosene kerosene2=new Kerosene(500);
		System.out.println("Kerosene price:"+kerosene2.price);
		
	}
}