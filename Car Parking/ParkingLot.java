//singleton class
public class ParkingLot
{
	private String name;
	private Map<String , Entrance> entrances;
	private Map<String , Exits> exits;
	private Map<String , ParkingFloor> parkingfloors;
	private ParkingDisplayBoard globalDisplayBoard;
	private static ParkingLot parkingLot = null;
	public ParkingLot(Map<String , Entrance> entrances , Map<String , Exits> exits, Map<String , ParkingFloor> parkingfloors , ParkingDisplayBoard globalDisplayBoard)
	{
		
	}
	
	private static ParkingLot getInstance()
	{
		if(parkingLot == null)
		{
			parkingLot = new ParkingLot(entrances,exits,parkingfloors,globalDisplayBoard);
		}
		return parkingLot;
	}
	public boolean addEntrances(Entrance entrance)
	{
		//at every entrance we need to have a display board
		entrance.setParkingDisplayBoard(globalDisplayBoard);
		entrance[entrance.getId()] = entrance;
		return true;
	}
	public boolean addExits(Exits exit)
	{
		exits[exit.getId()]{};
	}
	public boolean addFloor(ParkingLot lot , ParkingFloor pf)
	{
		
	}
}