import java.util.Scanner;
import java.util.Arrays;
public class lab3 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int temp;
        int sum=0;
        float avg;
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] b=Arrays.copyOf(arr,arr.length);
    System.out.println("copied array is"+Arrays.toString(b));
        int[]mer=new int[2*n];
        System.arraycopy(arr,0,mer,0,arr.length);
        System.arraycopy(b, 0, mer, arr.length,b.length);
        System.out.println(" merged array is"+Arrays.toString(mer));
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println("ascending order of array");
        for (int i=0;i<n;i++){
            
            System.out.print(arr[i]+" ");
        }
        System.out.println("max element:"+arr[n-1]);
        System.out.println("min element:"+arr[0]);
        for(int i=0;i<n;i++){
        sum=sum+arr[i];
        }
        avg=sum/n;
        System.out.println("sum of the elements is:"+sum+" average of elements is"+avg);

    int evencount=0;
    int oddcount=0;
    for(int i=0;i<n;i++){
        if(arr[i]%2==0){
            evencount++;
        }
        else{
            oddcount++;
        }
    }
    System.out.println("even terms are "+evencount+" odd terms are "+oddcount);

//reverse of an array
    int start=0;
    int end=n-1;
    int temp1;
    while(start<end){
        temp1=b[start];
        b[start]=b[end];
        b[end]=temp1;
 start++;
 end--;
    }
    System.out.println("reversed array is:"+Arrays.toString(b));
    int[]c={1,2,3,4};
    //check weather the array reads same from front and back
   boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is NOT a palindrome.");
        }
//duplicates
int[] d={1,2,3,2,2,3,4,5};
int[] uniqueArr = Arrays.stream(d).distinct().toArray();
System.out.println("array after removing duplicates:"+Arrays.toString(uniqueArr));
    }
}
    
    

