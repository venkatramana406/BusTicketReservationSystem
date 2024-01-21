package BusTicketBookings;
import java.util.Scanner;
import java.util.ArrayList;
public class MainClass {
	public static void main(String[]args)
	{
		ArrayList<Bus> buses = new ArrayList<>();
		ArrayList<Booking> booking = new ArrayList<>();
		
		buses.add(new Bus(1,2,true));
		buses.add(new Bus(2,50,true));
		buses.add(new Bus(3,55,false));
		
		for(Bus bus:buses)
		{
			bus.displayInfo();
		}
		Scanner scan = new Scanner(System.in);
		int opt=1;
	
		while(opt==1)
		{
			System.out.println("Enter 1 to book or 2 to exit");
			opt=scan.nextInt();
			if(opt==1)
			{
				Booking book = new Booking();
				if(book.isAvailable(booking,buses))
				{
					booking.add(book);
					System.out.println("Thanks for Booked");
				}
				else {
					System.out.println("Sorry,Bus is full try Another Bus or date");
				}
			}
			else {
				System.out.println("Thank you,Welcome");
			}
		}
	}
}
