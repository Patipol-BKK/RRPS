package Assignment;

abstract class Table {
    private int tableId;
    private boolean reserved;
    private int pax;

    public int getTableId(){return this.tableId;}
    public boolean getreserved(){return this.reserved;}
    public int getpax(){return this.pax;}

    public void setTableId(int tableId){this.tableId = tableId;}

    public void setReserved(boolean r){this.reserved = r;}
}
