class Movie
{
    public static void section(String name,int age)
	{
	    System.out.println("running section in movie");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		if(age>0 && age<18)
		{
		    System.out.println("Price is 500");
		}
		else
		{
		    System.out.println("Price is 1000");
		}
	}
}