//2nd task 1-7-24

class Brand
{
    public static void thread()
	{
		double price=99.99;
		//re-assign
		price=999.99;
		System.out.println("price:"+price);
		
		char grade = 'A';
        System.out.println("Grade: " +grade);
		
    }
	public static void main(String[] args)
	{
		thread();
	}
}