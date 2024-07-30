//task 25-7-24


class ChargerRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in ChargerRunner");
		Charger charger=new Charger();
		charger.name="Mobile charger";
		System.out.println("charger updated name:"+charger.name);
	    charger.size=5;
		System.out.println("charger updated size:"+charger.size);
        int price=charger.price;
		System.out.println("charger updated price:"+charger.price);
	    
		Claw claw=new Claw();
		String name=claw.name; 
		System.out.println("Claw updated name:"+claw.name);
		claw.size=3;
	    System.out.println("Claw updated size:"+claw.size);
		claw.price=50000;
		System.out.println("Claw updated price:"+claw.price);
		
		Crow crow=new Crow();
		crow.name="Variety of crows";
		System.out.println("crow updated name:"+crow.name);
	    crow.color="Black";
		System.out.println("crow updated color:"+crow.color);
        double weight=crow.weight;
		System.out.println("crow updated weight:"+crow.weight);
		
		Clock clock=new Clock();
		String brandName=clock.brandName;
		System.out.println("clock updated Brand name:"+clock.brandName);
		clock.warranty=3;
		System.out.println("clock updated warranty:"+clock.warranty);
		clock.price=500;
		System.out.println("clock updated price:"+clock.price);
		
		Lolipop lolipop=new Lolipop();
		String brandName1=lolipop.brandName1;
		System.out.println("Lolipop updated Brand name:"+lolipop.brandName1);
		lolipop.color="Cream color";
		System.out.println("Lolipop updated color:"+lolipop.color);
		lolipop.price1=10;
		System.out.println("Lolipop updated price:"+lolipop.price1);
		
		Jean jean=new Jean();
		int size=jean.size;
		System.out.println("Jean updated size:"+jean.size);
		jean.color="Blue";
		System.out.println("Jean updated color:"+jean.color);
		jean.price=1000;
		System.out.println("Jean updated price:"+jean.price);
		
		Keyboard keyboard=new Keyboard();
		String brandName2=keyboard.brandName2;
		System.out.println("Keyboard updated brandName:"+keyboard.brandName2);
		keyboard.size2=17;
		System.out.println("Keyboard updated size:"+keyboard.size2);
		keyboard.price=1000;
		System.out.println("Keyboard updated price:"+keyboard.price);
		
		Mountain mountain=new Mountain();
		String name3=mountain.name3;
		System.out.println("Mountain updated name:"+mountain.name3);
		mountain.height=8849;
		System.out.println("Mountain updated height:"+mountain.height);
		mountain.width=19.3;
		System.out.println("Mountain updated width:"+mountain.width);
		
		Stadium stadium=new Stadium();
		String name4=stadium.name4;
		System.out.println("Stadium updated Brand name:"+stadium.name4);
		stadium.size=40000;
		System.out.println("Stadium updated size:"+stadium.size);
		stadium.price=10;
		System.out.println("Stadium updated price:"+stadium.price);
		
		Spray spray=new Spray();
		String brandName5=spray.brandName5;
		System.out.println("Spray updated Brand name:"+spray.brandName5);
		spray.form="Liquid";
		System.out.println("Spray updated form:"+spray.form);
		spray.price=500;
		System.out.println("Spray updated price:"+spray.price);
		
		System.out.println("End main in ChargerRunner");
	}
   
}