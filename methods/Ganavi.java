//task-2 7-8-24


class Ganavi
{
	String email;
	Clip clip;
	
	public Ganavi(String email,Clip clip)
	{
		this.email=email;
		this.clip=clip;
		System.out.println("created Ganavi using string,clip const");
	}
	
	public void details()
	{
		System.out.println("Start details in Ganavi");
		System.out.println("email:"+this.email);
		clip.details();
		System.out.println("End details in Ganavi");
	}
}