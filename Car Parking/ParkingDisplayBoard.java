public class ParkingDisplayBoard
{
	private String id;
	Map<ParkingSpotType , Integer> parkingSpotCount;
	ParkingDisplayBoard(Map<ParkingSpotType , Integer> parkingSpotCount)
	{
		this.parkingSpotCount = parkingSpotCount;
	}
	void changeCount(ParkingSpotType type,Integer change)
	{
		parkingSpotCount[type] += change;
	}
}