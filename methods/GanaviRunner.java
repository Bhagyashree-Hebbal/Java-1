//task-2 7-8-24


class GanaviRunner
{
	public static void main(String[] args)
	{
		Clip clip=new Clip("Red","Hair Clips");
		Ganavi ganavi=new Ganavi("ganavi123@gmail.com",clip);
		ganavi.details();
		
		System.out.println("=============================");
		
		Clip clip1=new Clip("Green","Cloth Clips");
		Ganavi ganavi1=new Ganavi("ganavi001@gmail.com",clip1);
		ganavi1.details();
	}
}