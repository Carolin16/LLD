class Database
{
	private String databaseName;
	//tableMap : tableName , table Object
	private Map<String , Table> tableMap;
	public Database(String databaseName)
	{
		this.databaseName = databaseName;
	}
	public void createTable(String tableName , List<Column> columns)
	{
		if(checkIfTableExists(tableName))
		{
			System.out.println("Table : " + tableName + "already exists");
			return;
		}
		Table table = new Table(tableName , columns);
		tableMap.put(tableName , table);
		return;
	}
	public void insertRowsIntoTable(String tableName , Map<Column , Object> columnValues)
	{
		if(!checkIfTableExists(tableName))
		{
			//Table table = new Table(tableName , columnValues);
			return;
		}
		Table table = tableMap.get(tableName);
		table.insertRows(columnValues);
	}
	public void truncateTable(String tableName)
	{
		if(!checkIfTableExists(tableName))
		{
			System.out.println("Table : " + tableName + "doesnt exists");
			return;
		}
		Table table = tableMap.get(tableName);
		table.truncateRows(columnValues);
	}
	public void dropTable(String tableName)
	{
		if(!checkIfTableExists(tableName))
		{
			System.out.println("Table : " + tableName + "doesnt exists");
			return;
		}
		
		tableMap.remove(tableName);
	}
	public void filterTable(String tableName , Column column , Object value)
	{
		if(!checkIfTableExists(tableName))
		{
			System.out.println("Table : " + tableName + "doesnt exists");
			return;
		}
		Table table = tableMap.get(tableName);
		table.filter(column , value);
	}
	public void printTable(String tableName)
	{
		if(!checkIfTableExists(tableName))
		{
			System.out.println("Table : " + tableName + "doesnt exists");
			return;
		}
		Table table = tableMap.get(tableName);
		table.printRows();
	}
	public boolean checkIfTableExists(String tableName)
	{
		if(tableMap.containsKey(tableName))
		{
			return true;
		}
	return false;
	}
}