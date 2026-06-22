import java.util.Scanner;

public class railway {
    public static void main(String[]args){
        int[] seats=new int[10];
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n--- Railway Reservation System ---");
            System.out.println("1. Display Seat Availability");
            System.out.println("2. Book a Seat");
            System.out.println("3. Cancel a Seat");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("\nSeat Availability:");
                    for (int i = 0; i < seats.length; i++) {
                        System.out.println("Seat " + (i + 1) + ": " + (seats[i] == 0 ? "Empty" : "Booked"));
                    }
                    break;
                case 2:
                System.out.println("enter a seat number to book");
                int bookseat=sc.nextInt();
               
                if(bookseat < 0||bookseat > 10){
                    System.out.println("invalid seat number");
                }else if(seats[bookseat-1]==1){
                    System.out.println("the seat is already booked");
                } else{
                    seats[bookseat-1]=1;
                }
                break;
                case 3:
                System.out.println("enter seat number to be cancelled");
                int cancelseat=sc.nextInt();
                if(cancelseat>10||cancelseat<0){
                    System.out.println("seat doesnot exists");
                }else if(seats[cancelseat-1]!=1){
                    System.out.println("the seat is already empty");
                }else{
                    seats[cancelseat-1]=0;
                }
                break;
                case 4:
                 System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        }while(choice!=4);

    }
}
