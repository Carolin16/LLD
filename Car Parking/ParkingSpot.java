abstract class ParkingSpot
{
	private String id;
	private Vehicle vehicle;
	private boolean isFree;
	private ParkingFloor parkingFloor;
	private ParkingSpotType type;
	ParkingSpot(ParkingFloor parkingFloor , ParkingSpotType type)
	{
		this.parkingFloor = parkingFloor;
		this.type = type;
	}
	void assignVehicle(Vehicle v)
	{
		this.vehicle = v;
		this.isFree = false;
		this.parkingFloor.getParkingDisplayBoard().changeCount(type,-1);
		this.parkingFloor.getGlobalDisplayBoard().changeCount(type,-1);
	}
	void freeParkingSpot()
	{
		this.vehicle = null;
		this.isFree = true;
		this.parkingFloor.getParkingDisplayBoard().changeCount(type,1);
		this.parkingFloor.getGlobalDisplayBoard().changeCount(type,1);
	}
}
public class Compact extends ParkingSpot
{
	Compact(ParkingFloor parkingFloor)
	{
		super(parkingFloor,Compact.type);
	}
}
public class Electric extends ParkingSpot
{
	Electric(ParkingFloor parkingFloor)
	{
		super(parkingFloor,Electric.type);
	}
	void acceptPayment()
	{
		
	}
}