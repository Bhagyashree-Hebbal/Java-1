class Section
{
    public static void school(byte id,short noOfStudents)
	{
		System.out.println("Id:"+id);
		System.out.println("No of Students:"+noOfStudents);
	}

	public static void schoolName(String schoolName,int fees,int noOfPresentStudents)
	{
		System.out.println("SchoolName:"+schoolName);
		System.out.println("Fees:"+fees);
		System.out.println("NoOfPresentStudents:"+noOfPresentStudents);
		if(fees>0 && fees<20000)
		{
			System.out.println("It is no costly school");
		}
		else
		{
			System.out.println("It is costly school");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Start main in section");
		byte id=1;
		short noOfStudents=50;
		String schoolName="Sharnbasva University";
		int fees=15000;
		int noOfPresentStudents=40;
		school(id,noOfStudents);
		school(id,noOfStudents);
		school(id,noOfStudents);
		school(id,noOfStudents);
		schoolName(schoolName,fees,noOfPresentStudents);
	}
}