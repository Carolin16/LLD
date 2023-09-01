class Storage
{
	Map<String , String> map;
	//capacity need not be modified later
	private final Integer capacity;
	Storage(Integer capacity)
	{
		this.capacity = capacity;
		map = new HashMap<>();
	}
	public void add(String key , String value)
	{
		if(!isStorageFull())
		{
			map.put(key , value);
			return;
		}
		return;
	}
	public void remove(String key)
	{
		if(!map.containsKey(key))
		{
			return;
		}
		map.remove(key);
		return;
	}
	public String get(String key)
	{
		return map.get(key);
	}
	public boolean isStorageFull()
	{
		return map.size() == capacity;
	}
}