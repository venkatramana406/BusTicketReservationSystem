package BusTicketBookings;

public class Bus {
	private int busNo;
	private int capacity;
	private boolean ac;
	Bus(int busNo,int capacity,boolean ac)
	{
		this.busNo=busNo;
		this.capacity=capacity;
		this.ac=ac;
	}
	public void setBusNo(int busNo)
	{
		this.busNo=busNo;
	}
	public int getBusNo()
	{
		return busNo;
	}
	public void setCapacity(int capacity)
	{
		this.capacity=capacity;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public void setac(boolean ac)
	{
		this.ac=ac;
	}
	public boolean getac()
	{
		return ac;
	}
	public void displayInfo() {
		System.out.println("Bus Number: "+busNo+" Total Seats: "+capacity+" Ac: "+ac);
	}
}
