//4th task

class SMS
{
    public static void sendMessage()
	{
	    System.out.println("Sent message");
		recieveMessage();
	}
	public static void recieveMessage()
	{
	    System.out.println("Recieve message");
		sendMessage();
	}
}