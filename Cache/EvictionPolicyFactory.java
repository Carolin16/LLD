public class EvictionFactory
{
	public EvictionPolicy getEvicitionPolicy(String policy)
	{
		if(policy.equals("lru"))
		{
			return new LRU();
		}
		else if(policy.equals("fifo"))
		{
			return new FIFO();
		}
		return null;
	}
}