class Table{
	private String name;
	private Integer autoIncrementId;
	//note : this map doesnt contain row data , only column structure - column name , type
	private Map<String , Column> columnMap = new HashMap():
	List<Row> rows = new ArrayList<>();
	Table(String name , List<Column> columns)
	{
		this.autoIncrementId = 1;
		this.name = name;
		populateColumns(columns);
	}
	void populateColumns(List<Column> columns)
	{
		for(Column column : columns)
		{
			columnMap.put(column.getColumnName() , column);
		}
	}
	//note : we are not using column map here , we are only pushing / inserting rows into row class map
	protected void insertRows(Map<Column , Object> columnValues)
	{
		for(Column column : columnValues.keySet())
		{
			if(!checkIfColumnExists(column))
			{
				return;
			}
		Integer rowId = getAutoIncrementId();
		Map<Column , Object> columnData = new Map(columnValues);
		Row row = new Row(rowId , columnData);
		this.rows.add(row);
		}
	}
	protected void filter(Column column , Object object)
	{
	 List<Row> row = new ArrayList<>();
	 for(Row row : this.rows)
	 {
		 //  row.getColumnData() returns a map - column , row data for each column
		 Object columnValue = row.getColumnData().get(column);
		 if(columnValue.equals(object))
		 {
			 rows.add(row);
		 }
	 }
	 printRecords(rows);
	}
	boolean checkIfColumnExists(String columnName)
	{
		if(columnMap.containsKey(columnName))
		{
			return true;
		}
		return false;
	}
	private synchronized Integer getAutoIncrementId()
	{
		return this.autoIncrementId++;
	}
	void truncateRows()
	{
		this.rows.clear();
	}
	void printRows()
	{
		printRecords(this.rows);
	}
	private void printRecords(List<row> rows)
	{
		//column headers
		for(Map.Entry<String , Object> entry:this.columnMap.keySet())
		{
			//note : columnMap key - column Name
			System.out.print("\t" + entry.getKey() + "\t");
			//print the row content
			for(Row row : rows)
			{
				System.out.println("\t" + row.getRowId() + "\t");
				// note : row class - columnData map - value - row data
				for(Map.Entry<String , Object> entry : row.getColumnData.entrySet())
				{	//note : DO NOT try entry.getColumnData / row.getColumnData
					System.out.print("\t" + entry.getValue() + "\t");
				}
			}
			System.out.println();

		}
	}

}