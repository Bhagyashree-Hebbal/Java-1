//task-3 5-8-24


class ChocolateRunner
{
	public static void main(String[] args)
	{
		Chocolate chocolate=new Chocolate("Dairy Milk");
		chocolate.setPrice(100);
		chocolate.size='S';
		chocolate.display();
		
		System.out.println("=========================================");
		
		Chocolate chocolate1=new Chocolate("Kitkat");
		chocolate1.setPrice(50);
		chocolate1.size='S';
		chocolate1.display();
		
		System.out.println("=========================================");
		
		Chocolate chocolate2=new Chocolate("Milky bar");
		chocolate2.setPrice(20);
		chocolate2.size='S';
		chocolate2.display();
	}
}