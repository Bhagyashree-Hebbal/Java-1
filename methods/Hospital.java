//2nd task 9-7-24


class Hospital
{
    public static String medicineName(double price)
	{
		System.out.println("running medicineName in hospital");
		System.out.println("Price:"+price);
		if(price==150)
		{
			return "Metformin";
		}
		if(price==100)
		{
			return "protamine sulface";
		}
		if(price==200)
		{
			return "Digoxin";
		}
		System.out.println("NO item found");
		return "NOT FOUND";
	}


    public static String symptom(String medicineName)
	{
		System.out.println("running symptom in hospital");
		System.out.println("MedicineName:"+medicineName);
		if(medicineName=="Prastamol")
		{
			return "fever";
		}
		if(medicineName=="Silicazib")
		{
			return "leg and back pain";
		}
		if(medicineName=="Multi-vitamin")
		{
			return "Physical Strength";
		}
		System.out.println("NO item found");
		return "antibiotic";
	}
	
	
	public static String doctorName(String availability)
	{
		System.out.println("running doctorName in hospital");
		System.out.println("Availability:"+availability);
		if(availability=="8AM to 10AM")
		{
			return "Dr.Manjunath";
		}
		if(availability=="11AM to 1PM")
		{
			return "Dr.Anurup Shah";
		}
		if(availability=="3PM to 5PM")
		{
			return "Dr.Sanjeevini";
		}
		System.out.println("NO item found");
		return "Dr.Kalyani";
	}
}