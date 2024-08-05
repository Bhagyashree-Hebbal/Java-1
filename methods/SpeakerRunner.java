class SpeakerRunner
{
	public static void main(String[] args)
	{
		Speaker speaker=new Speaker("12H");
		speaker.setCost(1000);
		speaker.brand="Sumsung";
		speaker.display();
		
		System.out.println("=========================================");
		
		Speaker speaker2=new Speaker("16H");
		speaker2.setCost(2000);
		speaker2.brand="Sonos";
		speaker2.display();
		
		System.out.println("=========================================");
		
		Speaker speaker3=new Speaker("18H");
		speaker3.setCost(1000);
		speaker3.brand="Harman International";
		speaker3.display();
	}
}