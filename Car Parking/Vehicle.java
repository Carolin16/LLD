public abstract class Vehicle
{
	private String numberPlate;
	private final VehicleType type;
	private ParkingTicket ticket;
	Vehicle(VehicleType type)
	{
		this.type = type;
	}
	public String getNumberPlate()
	{
		return this.numberPlate;
	}
	public boolean assignTicket(ParkingTicket ticket)
	{
		this.ticket = ticket;
	}
}
public class Car extends Vehicle
{
	public Car()
	{
		super(VehicleType.car);
	}
}
public class Truck extends Vehicle
{
	public Truck()
	{
		super(VehicleType.truck);
	}
}