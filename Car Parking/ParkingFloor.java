public class ParkingFloor
{
	private String id;
	private Map<String , ParkingSpot> parkingSpot;
	private ParkingDisplayBoard parkingDisplayBoard;
	private ParkingDisplayBoard globalDisplayBoard;
	ParkingFloor(Map<String , ParkingSpot> parkingSpot , ParkingDisplayBoard parkingDisplayBoard ,ParkingDisplayBoard globalDisplayBoard)
	{
		this.parkingSpot = parkingSpot;
		this.parkingDisplayBoard = parkingDisplayBoard;
		this.globalDisplayBoard = globalDisplayBoard;
	}
	void addParkingSpot(ParkingSpot spot)
	{
		parkingSpot[spot.getId()] = spot;
	}
	void removeParkingSpot(ParkingSpot spot)
	{
		parkingSpot[spot.getId()]{};;
	}
	ParkingDisplayBoard getParkingDisplayBoard()
	{
		return this.parkingDisplayBoard;
	}
	ParkingDisplayBoard getGlobalDisplayBoard()
	{
		return this.globalDisplayBoard;
	}
}
