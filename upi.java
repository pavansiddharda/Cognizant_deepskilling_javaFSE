public class upi {
    String upi_id="sidhu@564";
    double initial_balance=5000.00;
    double payment_made=2567.67;
    
    void calculate_balance(){
        double balance=initial_balance-payment_made;
        System.out.println(balance);
    }    public static void main(String[] args){
        upi obj= new upi();
        obj.calculate_balance();

    }
}
