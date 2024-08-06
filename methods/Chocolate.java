//task-3 5-8-24


class Chocolate
{
	String brand;
	double price;
	String flavour="Sweet";
	char size;
	
	public Chocolate(String brand)
	{
		this.brand=brand;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void display()
	{
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("flavour:"+flavour);
		System.out.println("size:"+size);
	}
}