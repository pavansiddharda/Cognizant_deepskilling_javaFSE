public class patterns {
    public static void main(String[]args){
        int k=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print( k+" ");
                k++;
            }
            System.out.println();
        }
  
System.out.println();System.out.println();
        int rows = 7;
int cols = 7; // width of the parallelogram

for (int i = 1; i <= rows; i++) {
    // print leading spaces
    for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
    }

    // print stars only at border positions
    for (int p = 1; p <= cols; p++) {
        if (i == 1 || i == rows || p == 1 || p == cols) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }

    System.out.println();
}
    }
}


    