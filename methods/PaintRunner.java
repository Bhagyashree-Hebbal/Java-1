//1st&2nd Task- 2-7-24


class PaintRunner
{
    public static void main(String[] args)
	{
	    Paint.sketch("Nippon Paints");
	    Paint.sketch("Nippon Paints","Orange");
	    Paint.sketch("Nippon Paints",15000);
	    Paint.sketch("Orange","Decorative",15000);
		
		
		Train.book("Kalaburagi","Bangalore");
		Train.book("Kalaburagi","Bangalore",10);
		Train.book("Kalaburagi","Bangalore",10,500);
		Train.cancel(52500145);
		Train.cancel("Kalaburagi","Bangalore");
	}
}