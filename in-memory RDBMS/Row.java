class Row
{
	private Integer rowId;
	//for each column row data
	private Map<Column , Object> columnData;
	public Row(Integer rowId , Map<Column , Object> columnData)
	{
		this.rowId = rowId;
		this.columnData = columnData;
	}
	public Integer getRowId()
	{
		return this.rowId;
	}
	public Map<Column , Object> getColumnData()
	{
		return this.columnData;
	}
}