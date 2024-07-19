//2nd task 4-7-24


class Buy
{
    public static void product(String brand,double price)
	{
		System.out.println("Running product in brand and price with string and double parameter");
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		if(price>0 && price<1500)
        {
			System.out.println("It is valid");
		}
        else
        {
			System.out.println("It is invalid");
		}			
	}
	public static void product(String name,int quantity,String quality,double price)
	{
		System.out.println("Running product in name,quantity and price with string,int and double parameter");
		System.out.println("Name:"+name);
		System.out.println("Quantity:"+quantity);
		System.out.println("Quality:"+quality);
		System.out.println("Price:"+price);
		if(quantity>0 && quantity<100)
        {
			System.out.println("It is valid");
		}
        else
        {
			System.out.println("It is invalid");
		}
	}
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
	{
		System.out.println("Running bookMovieTicket in name,theaterName,quantity and price with string,int and double parameter");
		System.out.println("Name:"+name);
		System.out.println("TheaterName:"+theaterName);
		System.out.println("Quantity:"+quantity);
		System.out.println("Price:"+price);
		if(price>0 && price<500)
        {
			System.out.println("It is valid");
		}
        else
        {
			System.out.println("It is invalid");
		}
	}
	public static void buyEgg(int total,double pricePerEgg)
	{
		System.out.println("Running buyEgg in total and pricePerEgg with int and double parameter");
		System.out.println("Total:"+total);
		System.out.println("PricePerEgg:"+pricePerEgg);
		if(total>0 && total<200)
        {
			System.out.println("It is valid");
		}
        else
        {
			System.out.println("It is invalid");
		}
	}
	public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
	{
		System.out.println("Running buyShampoo in quantityInMl,price,brand and manfDate with int,double and String parameter");
		System.out.println("QuantityInMl:"+quantityInMl);
		System.out.println("Price:"+price);
		System.out.println("Brand:"+brand);
		System.out.println("ManfDate:"+manfDate);
		if(price>0 && price<90)
        {
			System.out.println("It is valid");
		}
        else
        {
			System.out.println("It is invalid");
		}
	}
	public static void buyCake(char size,String type,String flavour,double cost,int quantity)
	{
		System.out.println("Running buyCake in size,type,flavour,cost and quantity with int,char,String and double parameter");
		System.out.println("Size:"+size);
		System.out.println("Type:"+type);
		System.out.println("Flavour:"+flavour);
		System.out.println("Cost:"+cost);
		System.out.println("Quantity:"+quantity);
		if(quantity>0 && quantity<5)
        {
			System.out.println("It is valid");
		}
        else
        {
			System.out.println("It is invalid");
		}
	}
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
	{
		System.out.println("Running buyLaptop in brand,serialNo,price,batteryCapacity,screenSize,os,harddiskSize and ramSize with int,String and double parameter");
		System.out.println("Brand:"+brand);
		System.out.println("SerialNo:"+serialNo);
		System.out.println("Price:"+price);
		System.out.println("BatteryCapacity:"+batteryCapacity);
		System.out.println("ScreenSize:"+screenSize);
		System.out.println("OS:"+os);
		System.out.println("HarddiskSize:"+harddiskSize);
		System.out.println("RamSize:"+ramSize);
		if(serialNo>0 && serialNo<60)
        {
			System.out.println("It is valid");
		}
        else
        {
			System.out.println("It is invalid");
		}
	}
	public static void buySmartWatch(String brand,double price,int color,char type,int mode)
	{
		System.out.println("Running buySmartWatch in brand,price,color,type and mode with int,char,double and String parameter");
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		System.out.println("Color:"+color);
		System.out.println("Type:"+type);
		System.out.println("Mode:"+mode);
		if(color>0 && color<7)
        {
			System.out.println("It is valid");
		}
        else
        {
			System.out.println("It is invalid");
		}
	}
}