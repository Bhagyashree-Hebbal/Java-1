//2nd task 16-7-24


class ContainerRunner
{
	public static void main(String[] person)
	{
		System.out.println("Start main in person");
		if(person.length==4)
		{
			System.out.println("Getting 4 ref from main method arguments");
			String name=person[0];
			String email=person[1];
			String age=person[2];
			String password=person[3];
			System.out.println("Name:"+name);
			System.out.println("Email:"+email);
			System.out.println("Age:"+age);
			System.out.println("Password:"+password);
		}
		else
		{
			System.out.println("Not enough references,need 4 references");
		}
		System.out.println("End main in person");
	}
}