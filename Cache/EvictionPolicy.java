//why evictionPolicy abstract ? - lru and fifo wanted to implement their own eviction policies
abstract class EvictionPolicy
{
	//why dll ? and not arrays ? 
	protected DLL dll;
	//why protected - protected data members are accessible only to subclasses or classes of packages
	protected Map<String , Node> map;
	public EvictionPolicy()
	{
		this.dll =  new DLL();
		map = new HashMap<>();
	}
	
	//based on eviction policy implement methods
	abstract void accessKey(String key);
	abstract void evictKey();
}

