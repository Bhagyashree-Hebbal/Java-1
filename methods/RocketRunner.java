//task-2 5-8-24


class RocketRunner
{
	public static void main(String[] args)
	{
		Rocket rocket=new Rocket("India");
		rocket.setFuelCapacity(2800000);
		rocket.noOfThrusters=4;
		rocket.display();
		
		System.out.println("=========================================");
		
		Rocket rocket1=new Rocket("Russia");
		rocket1.setFuelCapacity(3000000);
		rocket1.noOfThrusters=4;
		rocket1.display();
		
		System.out.println("=========================================");
		
		Rocket rocket2=new Rocket("United States");
		rocket2.setFuelCapacity(3500000);
		rocket2.noOfThrusters=4;
		rocket2.display();
	}
}