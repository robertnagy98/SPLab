public class Table  implements Element {
    private String tableTitle;

    Table (String tableTitle){

        this.tableTitle=tableTitle;
    }
    public void print()
    {
        System.out.print("Table with name: " + this.tableTitle);
    }
}
