public class Entrance
{
	private String id;
	private ParkingDisplayBoard globalDisplayBoard;
	Entrance()
	{
		
	}
	public boolean issueTicket(Vehicle v)
	{
		if(checkAvailability(v))
		{
			v.assignTicket(new ParkingTicket(v.getNumberPlate()));
		}
		else
		{
			System.out.println('No availability');
		}
	}
	public void setParkingDisplayBoard(ParkingDisplayBoard globalDisplayBoard)
	{
		this.globalDisplayBoard = globalDisplayBoard; 
	}
}