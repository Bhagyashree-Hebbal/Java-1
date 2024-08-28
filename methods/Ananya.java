//task-3 7-8-24


class Ananya
{
	long mobile;
	Knife knife;
	
	public Ananya(long mobile,Knife knife)
	{
		this.mobile=mobile;
		this.knife=knife;
		System.out.println("created Ananya using long,Knife const");
	}
	
	public void details()
	{
		System.out.println("Start details in Ananya");
		System.out.println("mobile:"+this.mobile);
		knife.details();
		System.out.println("End details in Ananya");
	}
}