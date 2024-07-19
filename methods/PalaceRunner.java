//2nd task 16-7-24


class PalaceRunner
{
    public static void main(String[] palace)
	{
		System.out.println("Start main in palace");
		if(palace.length==4)
		{
			System.out.println("Getting 4 ref from main method arguments");
			String name=palace[0];
			String location=palace[1];
			String builtBy=palace[2];
			String buildYear=palace[3];
			System.out.println("Name:"+name);
			System.out.println("Location:"+location);
			System.out.println("BuiltBy:"+builtBy);
			System.out.println("BuildYear:"+buildYear);
		}
		else
		{
			System.out.println("Not enough references,need 4 references");
		}
		System.out.println("End main in palace");
	}
}
