
import java.util.Scanner;
public class evenodd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
    
        if(a%2==0){
            System.out.println("given number is even");
        }
        else{
            System.out.println("the given number is odd");
        }
    }
    
}
