import java.util.Arrays;

class arraycopy{
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int[] copy=arr.clone();
        int[] b=Arrays.copyOf(arr,arr.length);
        int [] c=arr;
        copy[0]=99;
        int[] arr1={10,20,30};
        int[] mer=new int[10];
        
        System.arraycopy(arr,0,mer,0,arr.length);
        System.arraycopy(arr1, 0, mer, arr.length,arr1.length);
        System.out.println(Arrays.toString(mer));
        
        
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(arr));
        b[0]=100;
        System.out.println(Arrays.toString(b));
        c[0]=25;
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(arr));

    }
}
/*import java.util.Arrays;

public class ArrayCopy3 {
    public static void main(String[] args) {
        int[] arr = {7, 14, 21};
        int[] copy = new int[5];

        // Copy elements of arr into copy starting at index 1
        System.arraycopy(arr, 0, copy, 1, arr.length);

        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Copy: " + Arrays.toString(copy));
    }
}*/