//2nd task- 8/7/24


class ChainRunner
{
	public static void main(String[] chain)
	{
		System.out.println("running main in ChainRunner");
		double value=Chain.carat();
		System.out.println("carat return type:"+value);
		
		double price=Chain.costPerGram();
		System.out.println("costPerGram return type:"+price);
		
		String varity=Chain.type();
		System.out.println("type return type:"+varity);
		
		String rate=Chain.quality();
		System.out.println("quality return type:"+rate);
		
		int weight=Chain.quantity();
		System.out.println("quantity return type:"+weight);
		
		double recycle=Chain.wastage();
		System.out.println("wastage return type:"+recycle);
		
		double cost=Chain.serviceCharge();
		System.out.println("serviceCharge return type:"+cost);
		
		double tax=Chain.GST();
		System.out.println("GST return type:"+tax);
	}
	
}