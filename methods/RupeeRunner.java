//task 24-7-24


class RupeeRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main RupeeRunner");
		Rupee rupee=new Rupee();
		String rupeesPrepared=rupee.rupeesPrepared;
        int varietyOfRupees=rupee.varietyOfRupees;
	    double weight=rupee.weight;
		System.out.println("Rupee rupeesPrepared:"+rupeesPrepared);
		System.out.println("Rupee varietyOfRupees:"+varietyOfRupees);
		System.out.println("Rupee weight:"+weight);
		
		System.out.println("==============================================");
		
		AirCondition airCondition=new AirCondition();
		String name=airCondition.name;
        double price=airCondition.price;
	    int quantity=airCondition.quantity;
		System.out.println("AirCondition name:"+name);
		System.out.println("AirCondition price:"+price);
		System.out.println("AirCondition quantity:"+quantity);
		
		System.out.println("==============================================");
		
		Autorikshaw autorikshaw=new Autorikshaw();
		String name1=autorikshaw.name1;
        double price1=autorikshaw.price1;
	    int quantity1=autorikshaw.quantity1;
		System.out.println("Autorikshaw name:"+name1);
		System.out.println("Autorikshaw price:"+price1);
		System.out.println("Autorikshaw quantity:"+quantity1);
		
		System.out.println("==============================================");
		
		AutoDriver autoDriver=new AutoDriver();
		String name2=autoDriver.name2;
        double salary=autoDriver.salary;
	    char gender=autoDriver.gender;
		System.out.println("AutoDriver name:"+name2);
		System.out.println("AutoDriver salary:"+salary);
		System.out.println("AutoDriver gender:"+gender);
		
		System.out.println("==============================================");
		
		Rapido rapido=new Rapido();
		String name3=rapido.name3;
        double price3=rapido.price3;
	    int quantity3=rapido.quantity3;
		System.out.println("Rapido name:"+name3);
		System.out.println("Rapido price:"+price3);
		System.out.println("Rapido quantity:"+quantity3);
		
		System.out.println("==============================================");
		
		CabCompany cabCompany=new CabCompany();
		String name4=cabCompany.name4;
        double year=cabCompany.year;
	    int noOfVehicle4=cabCompany.noOfVehicle4;
		System.out.println("CabCompany name:"+name4);
		System.out.println("CabCompany year:"+year);
		System.out.println("CabCompany noOfVehicle:"+noOfVehicle4);
		
		System.out.println("==============================================");
		
		BMTC bmtc=new BMTC();
		String driverName5=bmtc.driverName5;
        double busNo5=bmtc.busNo5;
	    int noOfVehicle5=bmtc.noOfVehicle5;
		System.out.println("BMTC driverName:"+driverName5);
		System.out.println("BMTC busNo:"+busNo5);
		System.out.println("BMTC noOfVehicle:"+noOfVehicle5);
		
		System.out.println("==============================================");
		
		FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
		String name6=foodDeliveryCompany.name6;
        double busNo6=foodDeliveryCompany.busNo6;
	    int noOfFood=foodDeliveryCompany.noOfFood;
		System.out.println("FoodDeliveryCompany Name:"+name6);
		System.out.println("FoodDeliveryCompany busNo:"+busNo6);
		System.out.println("FoodDeliveryCompany noOfFood:"+noOfFood);
		
		System.out.println("*************************************************");
		
		Matrimony matrimony=new Matrimony();
		String name7=matrimony.name7;
        char gender7=matrimony.gender7;
	    int noOfUser=matrimony.noOfUser;
		System.out.println("Matrimony Name:"+name7);
		System.out.println("Matrimony gender:"+gender7);
		System.out.println("Matrimony noOfUser:"+noOfUser);
		
		matrimony.name7="Sushant";
		matrimony.gender7='M';
		matrimony.noOfUser=1;
		System.out.println("Matrimony update name:"+matrimony.name7);
		System.out.println("Matrimony update gender:"+matrimony.gender7);
		System.out.println("Matrimony update noOfUser:"+matrimony.noOfUser);
		
		System.out.println("==============================================");
		
		Application application=new Application();
		String name8=application.name8;
        int noOfUser8=application.noOfUser8;
	    double rating8=application.rating8;
		System.out.println("Application Name:"+name8);
		System.out.println("Application noOfUser8:"+noOfUser8);
		System.out.println("Application rating8:"+rating8);
		
		application.name8="Git Hub";
		application.noOfUser8=1;
		application.rating8=5;
		System.out.println("Application update name:"+application.name8);
		System.out.println("Application update noOfUser:"+application.noOfUser8);
		System.out.println("Application update rating:"+application.rating8);
		
		System.out.println("==============================================");
		
		Fruit fruit=new Fruit();
		String name9=fruit.name9;
        String color=fruit.color;
	    double price9=fruit.price9;
		System.out.println("Fruit Name:"+name9);
		System.out.println("Fruit color:"+color);
		System.out.println("Fruit price:"+price9);
		
		fruit.name9="Mango";
		fruit.color="Yellow";
		fruit.price9=100;
		System.out.println("Fruit update name:"+fruit.name9);
		System.out.println("Fruit update color:"+fruit.color);
		System.out.println("Fruit update price:"+fruit.price9);
		
		System.out.println("==============================================");
		
		Juice juice=new Juice();
		String name10=juice.name10;
        double price10=juice.price10;
	    int quantity10=juice.quantity10;
		System.out.println("Juice Name:"+name10);
		System.out.println("Juice price:"+price10);
		System.out.println("Juice quantity:"+quantity10);
		
		juice.name10="Apple";
		juice.price10=30;
		juice.quantity10=1;
		System.out.println("Juice update name:"+juice.name10);
		System.out.println("Juice update price:"+juice.price10);
		System.out.println("Juice update quantity:"+juice.quantity10);
		
		System.out.println("==============================================");
		
		Place place=new Place();
		String name11=place.name11;
        double price11=place.price11;
	    int noOfPlace=place.noOfPlace;
		System.out.println("Place Name:"+name11);
		System.out.println("Place price:"+price11);
		System.out.println("Place noOfPlace:"+noOfPlace);
		
		place.name11="Mysore";
		place.price11=500;
		place.noOfPlace=10;
		System.out.println("Place update name:"+place.name11);
		System.out.println("Place update price:"+place.price11);
		System.out.println("Place update noOfPlace:"+place.noOfPlace);
		
		System.out.println("==============================================");
		
		AlcoholBrand alcoholBrand=new AlcoholBrand();
		String name12=alcoholBrand.name12;
        double price12=alcoholBrand.price12;
	    int quantity12=alcoholBrand.quantity12;
		System.out.println("AlcoholBrand Name:"+name12);
		System.out.println("AlcoholBrand price:"+price12);
		System.out.println("AlcoholBrand quantity:"+quantity12);
		
		alcoholBrand.name12="Kingfisher";
		alcoholBrand.price12=500;
		alcoholBrand.quantity12=1;
		System.out.println("AlcoholBrand update name:"+alcoholBrand.name12);
		System.out.println("AlcoholBrand update price:"+alcoholBrand.price12);
		System.out.println("AlcoholBrand update quantity:"+alcoholBrand.quantity12);
		
		System.out.println("==============================================");
		
		Candy candy=new Candy();
		String name13=candy.name13;
        double price13=candy.price13;
	    int quantity13=candy.quantity13;
		System.out.println("Candy Name:"+name13);
		System.out.println("Candy price:"+price13);
		System.out.println("Candy quantity:"+quantity13);
		
		candy.name13="Chocobar";
		candy.price13=50;
		candy.quantity13=1;
		System.out.println("Candy update name:"+candy.name13);
		System.out.println("Candy update price:"+candy.price13);
		System.out.println("Candy update quantity:"+candy.quantity13);
		
		System.out.println("==============================================");
		
		Medicine medicine=new Medicine();
		String name14=medicine.name14;
        double price14=medicine.price14;
	    int quantity14=medicine.quantity14;
		System.out.println("Medicine Name:"+name14);
		System.out.println("Medicine price:"+price14);
		System.out.println("Medicine quantity:"+quantity14);
		
		medicine.name14="Paracetamol";
		medicine.price14=10;
		medicine.quantity14=5;
		System.out.println("Medicine update name:"+medicine.name14);
		System.out.println("Medicine update price:"+medicine.price14);
		System.out.println("Medicine update quantity:"+medicine.quantity14);
		
		System.out.println("==============================================");
		
		Food food=new Food();
		String name15=food.name15;
        double price15=food.price15;
	    int quantity15=food.quantity15;
		System.out.println("Food Name:"+name15);
		System.out.println("Food price:"+price15);
		System.out.println("Food quantity:"+quantity15);
		
		food.name15="Puri";
		food.price15=50;
		food.quantity15=1;
		System.out.println("Food update name:"+food.name15);
		System.out.println("Food update price:"+food.price15);
		System.out.println("Food update quantity:"+food.quantity15);
		
		System.out.println("==============================================");
		
		System.out.println("End main RupeeRunner");
	}
}