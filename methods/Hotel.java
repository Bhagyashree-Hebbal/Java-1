//task-1 6-8-24


class Hotel
{
	String name="Punjab"; 
	Owner owner=new Owner("Basavaraj",50,'M');
	
	Hotel()
	{
		System.out.println("created Hotel using no arg const");
	}
	public void print()
	{
		System.out.println("Hotel name:"+this.name);
		this.owner.print();
	}
}