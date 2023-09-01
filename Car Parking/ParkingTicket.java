public class ParkingTicket
{
	private String numberPlate;
	private Timestamp issueTime;
	public ParkingLot(String numberPlate)
	{
		this.numberPlate = numberPlate;
		this.issueTime = java.time.LocalTime.now();
	}
}