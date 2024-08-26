// Singleton design pattern
//allowes to create only one object
class PvrMovies
{
	private static PvrMovies mTicketID;
	private static boolean pvrTicketStatus=false;
	private PvrMovies(){
		System.out.println("Weicome to Pvr movies.....!");
	}
	public static PvrMovies bookPvrTicket(){
		if(pvrTicketStatus==false)
		{
			mTicketID =new PvrMovies();
			pvrTicketStatus=true;
		}
		return mTicketID;
	}
}
class BookMyShow 
{
	public static void main(String[] args) 
	{
		PvrMovies ticket1=PvrMovies.bookPvrTicket();
		System.out.println("your ticket id is "+ticket1);
		PvrMovies ticket2=PvrMovies.bookPvrTicket();
		System.out.println("your ticket id is "+ticket2);
	}
}
