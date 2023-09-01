import java.util.*;
public class Elevator
{
	int currentFloor;
	Direction direction;
	PriorityQueue<Request> upQueue;
	PriorityQueue<Request> downQueue;
	Elevator(int currentFloor)
	{
		this.currentFloor = currentFloor; 
		this.direction = Direction.idle;
		upQueue = new PriorityQueue<>((a,b) -> a.desiredFloor - b.desiredFloor);
		downQueue = new PriorityQueue<>((a,b) -> b.desiredFloor - a.desiredFloor);
	}
	void sendUpRequest(Request upRequest)
	{
		//if the user is outside elevator , lift needs to stop at the floor and pick the user up
		//to stop at floor current and desired floor should be same
		if(upRequest.location == Location.outside_elevator)
		{
			upQueue.offer(new Request(upRequest.currentFloor , upRequest.currentFloor , Direction.up , Location.outside_elevator));
			System.out.println("Append up request going to floor " + upRequest.currentFloor + ".");
		}
	upQueue.offer(upRequest);
	System.out.println("Append up request going to floor " + upRequest.desiredFloor + ".");
	}
	
	void sendDownRequest(Request downRequest)
	{
		//if the user is outside elevator , lift needs to stop at the floor and pick the user up
		//to stop at floor current and desired floor should be same
		if(downRequest.location == Location.outside_elevator)
		{
			downQueue.offer(new Request(downRequest.currentFloor , downRequest.currentFloor , Direction.down , Location.outside_elevator));
			  System.out.println("Append down request going to floor " + downRequest.currentFloor + ".");
		}
	downQueue.offer(downRequest);
	  System.out.println("Append down request going to floor " + downRequest.desiredFloor + ".");
	}
	void processUpRequest()
	{
		while(!this.upQueue.isEmpty())
		{
			Request request = upQueue.poll();
			this.currentFloor = request.desiredFloor;
			 System.out.println("Processing up requests. Elevator stopped at floor " + this.currentFloor + ".");
		}
		if(!downQueue.isEmpty())
		{
			this.direction = direction.down;
		}
		else
		{
			this.direction = direction.idle;
		}
	}
	void processDownRequest()
	{
		while(!this.downQueue.isEmpty())
		{
			Request request = downQueue.poll();
			this.currentFloor = request.desiredFloor;
			System.out.println("Processing down requests. Elevator stopped at floor " + this.currentFloor + ".");
		}
		if(!upQueue.isEmpty())
		{
			this.direction = direction.up;
		}
		else
		{
			this.direction = Direction.idle;
		}
	}
	void processRequests()
	{
		if(this.direction == Direction.up || this.direction == Direction.idle)
		{
			processUpRequest();
			processDownRequest();
		}
		else
		{
			processDownRequest();
			processUpRequest();
		}
	}
	void run()
	{
		while(!upQueue.isEmpty() || !downQueue.isEmpty())
		{
			processRequests();
		}
	System.out.println("Processed all requests");
	this.direction = Direction.idle;
	}
	public static void main(String[] args)
	{
		Elevator e = new Elevator(0);
		Request req1 = new Request(e.currentFloor ,  5 , Direction.up , Location.inside_elevator);
		Request req2 = new Request(e.currentFloor ,  3 , Direction.up , Location.inside_elevator);
		Request req3 = new Request(e.currentFloor ,  1 , Direction.down , Location.inside_elevator);
		Request req4 = new Request(e.currentFloor ,  2 , Direction.down , Location.outside_elevator);
		Request req5 = new Request(4, 0 , Direction.down , Location.inside_elevator);
		e.sendUpRequest(req1);
		e.sendUpRequest(req2);
		e.sendDownRequest(req5);
		e.sendDownRequest(req3);
		e.sendDownRequest(req4);
		
		e.run();
	}
}

