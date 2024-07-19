//2nd task 4-7-24


class BuyRunner
{
    public static void main(String[] buy)
	{
		System.out.println("Running main in BuyRunner");
		Buy.product("Sonata",1000);
		Buy.product("Sonata",2000);
		
		Buy.product("Sonata",50,"Premium",1000);
		Buy.product("Sonata",150,"Premium",1000);
		
		Buy.bookMovieTicket("Kotee","Sangam Theater",100,400);
		Buy.bookMovieTicket("Kotee","Sangam Theater",100,500);
		
		Buy.buyEgg(100,10);
		Buy.buyEgg(250,10);
		
		Buy.buyShampoo(10,80,"Vatika","01/06/2024");
		Buy.buyShampoo(10,100,"Vatika","01/06/2024");
		
		Buy.buyCake('S',"Round","Chocolate",600,3);
		Buy.buyCake('S',"Round","Chocolate",600,10);
		
		Buy.buyLaptop("HP",50,60000,4000,15.6,"Windows",3,16);
		Buy.buyLaptop("HP",70,60000,4000,15.6,"Windows",3,16);
		
		Buy.buySmartWatch("Sumsung",5000,3,'R',5);
		Buy.buySmartWatch("Sumsung",5000,9,'R',5);
	}
}