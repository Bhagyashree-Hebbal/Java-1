class MaskRunner
{
	public static void main(String[] args)
	{
		Mask mask1=new Mask();
		System.out.println("Mask cost:"+mask1.cost);
		System.out.println("Mask size:"+mask1.size);
		System.out.println("Mask material:"+mask1.material);
		
		System.out.println("=========================================");
		
		Mask mask2=new Mask(50);
		System.out.println("Mask cost:"+mask2.cost);
		
		System.out.println("=========================================");
		
		Mask mask3=new Mask('s');
		System.out.println("Mask size:"+mask3.size);
		
		System.out.println("=========================================");
		
		Mask mask4=new Mask("Cotton");
		System.out.println("Mask material:"+mask4.material);
		
		System.out.println("=========================================");
		
		Mask mask5=new Mask(150,'M',"Cotton");
		System.out.println("Mask cost:"+mask5.cost);
		System.out.println("Mask size:"+mask5.size);
		System.out.println("Mask material:"+mask5.material);
		
		System.out.println("=========================================");
		
		Mask mask6=new Mask(20,'m');
		System.out.println("Mask cost:"+mask6.cost);
		System.out.println("Mask size:"+mask6.size);
	}
}