public class librarybook {
    String booktitle="java programming";
    String authorname="book by oracle";
    int bookid=564;
    int days_overdue=10;
    double fine_per_day=2.50;
    void calculatefine(){
        double totalfine=days_overdue*fine_per_day;
        System.out.println("the fine is:" +totalfine);
    }
    public static void main(String[] args){

        librarybook obj=new librarybook();
        obj.calculatefine();
    }
    
}
