//task-4 5-8-24


class ProjectorRunner
{
	public static void main(String[] args)
	{
		Projector projector=new Projector("Epson");
		projector.setType("Laser");
		projector.color="white";
		projector.display();
		
		System.out.println("=========================================");
		
		Projector projector1=new Projector("Sony");
		projector1.setType("DLP");
		projector1.color="white";
		projector1.display();
		
		System.out.println("=========================================");
		
		Projector projector2=new Projector("Optoma");
		projector2.setType("LED");
		projector2.color="white";
		projector2.display();
	}
}