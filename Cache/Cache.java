public class Cache
{
	private final Storage storage;
	private final EvictionPolicy policy;
	/*Cache(Storage storage , EvictionPolicy policy)
	{
		this.storage = storage;
		this.policy = policy;
	}*/
	//FACTORY PATTERN SHOULD WORK THIS WAY
	Cache(Integer capacity , EvictionPolicy policy)
	{
		EvictionFactory factory = new EvictionFactory();
		EvictionPolicy policy = factory.getEvicitionPolicy(policy);
		this.storage = new Storage(capacity);
		this.policy = policy;
	}
	public void put(String key , String value)
	{
		if(storage.isStorageFull())
		{
			policy.evictKey();
		}
		this.storage.add(key , value);
		this.policy.accessKey(key);
	}
	public String get(String key)
	{
		this.policy.accessKey(key);
		return this.storage.get(key);
	}
}