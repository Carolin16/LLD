class FIFO extends EvictionPolicy
{
	void accessKey(String key)
	{
		//order of key access doestn matter
		return;
	}
	void evictKey()
	{
		Node node = getFirstNode();
		map.remove(node.data);
		dll.moveHead();
		return;
	}
}