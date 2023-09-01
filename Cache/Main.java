public class Main
{
	public static void main(String[] args)
	{
		//EvictionFactory factory = new EvictionFactory();
		//EvictionPolicy policy = factory.getEvicitionPolicy("lru");
		//Cache cache = new Cache(new Storage("10","100") , policy);
		Cache cache = new Cache("10" , "lru");
	}
}