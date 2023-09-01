class LRU extends EvictionPolicy
{
	void accessKey(String key)
	{
		//if key is present
		if(map.get(key)!-null)
		{
			//protected variables can be accessed from parent class by child class though cannot be accessed by parent class object from outside
			dll.detachNode(map.get(key));
		}
		else
		{
			Node node = new Node(key);
			map.put(key , node);
		}
	dll.attachNodeAtEnd(map.get(key));
	return;
	}
	void evictKey()
	{
		Node firstNode = getFirstNode();
		map.remove(firstNode.data);
		dll.moveHead();
		return;
	}
}
