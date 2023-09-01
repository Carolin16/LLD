public class Main
{
	public enum VehicleType
	{
		car,truck,van,motorbike;
	}
	public enum ParkingSpotType
	{
		handicapped,electric,compact,large;
	}
	public Abstract class Account
	{
		private String userName , password;
	}
	public class Admin extends Account
	{
		public boolean addParkingFloor(ParkingLot lot , ParkingFloor pf)
		{
			lot.addFloor(pf);
		}
		public boolean addParkingSpot( ParkingFloor pf , ParkingSpot ps)
		{
			
		}
		public boolean addGlobalDisplayBoard( ParkingFloor pf , ParkingDisplayBoard psb)
		{
			
		}
	}
	public class ParkingAttendant extends Account
	{
		public boolean processPayments(ParkingTicket ticket)
		{
			
		}
	}
}