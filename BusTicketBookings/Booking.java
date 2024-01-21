package BusTicketBookings;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter PassengerName: ");
		passengerName=scan.next();
		System.out.println("Enter Bus Number: ");
		busNo=scan.nextInt();
		System.out.println("Enter date dd-mm-yy");
		String d=scan.next();
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd-MM-yy");
		try {
			date=simpleDate.parse(d);
		} catch (ParseException e) {
			
			System.out.println("Invalid date format.!");
		}
	}

	public boolean isAvailable(ArrayList<Booking> booking, ArrayList<Bus> buses) {
		int capacity=0;
		for(Bus b:buses)
		{
			if(b.getBusNo()==busNo)
			{
				capacity=b.getCapacity();
			}
		}
		int bookingCount=0;
		for(Booking book:booking)
		{
			if(book.busNo==busNo && book.date.equals(date))
			{
				bookingCount++;
			}
		}
		return bookingCount<capacity?true:false;
	}
}
