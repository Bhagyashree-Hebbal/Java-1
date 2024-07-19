//2nd task 16-7-24


class ForestRunner
{
	public static void main(String[] forest)
	{
		System.out.println("Start main in forest");
		if(forest.length==4)
		{
			System.out.println("Getting 4 ref from main method arguments");
			String name=forest[0];
			String area=forest[1];
			String establishedYear=forest[2];
			String state=forest[3];
			System.out.println("Name:"+name);
			System.out.println("Area:"+area);
			System.out.println("EstablishedYear:"+establishedYear);
			System.out.println("State:"+state);
		}
		else
		{
			System.out.println("Not enough references,need 4 references");
		}
		System.out.println("End main in forest");
	}
}