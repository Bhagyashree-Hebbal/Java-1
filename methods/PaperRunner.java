class PaperRunner
{
	public static void main(String[] args)
	{
		Paper paper=new Paper(5);
		paper.setSize("Small");
		paper.color="Pink";
		paper.display();
		
		System.out.println("=========================================");
		
		Paper paper1=new Paper(2);
		paper1.setSize("Medium");
		paper1.color="white";
		paper1.display();
		
		System.out.println("=========================================");
		
		Paper paper2=new Paper(5);
		paper2.setSize("Long");
		paper2.color="white";
		paper2.display();
	    
	}
}