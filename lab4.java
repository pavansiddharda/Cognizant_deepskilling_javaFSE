public class lab4 {
    public static void main(String[] args){
        //first pattern
        int n=9;
        for(int i=n;i>0;i-=2){
            int spaces=(n-i)/2;
            for(int s=0;s<=spaces;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i=3;i<=n;i+=2){
            int spaces=(n-i)/2;
            for(int s=0;s<=spaces;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
        System.out.println();System.out.println();System.out.println();
        // second pattern
        int m=8;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
            if(i==1 || j==1 || i==m || j==m ||i==j || i==n-j){
                System.out.print("* ");
            }else {
    System.out.print("  ");  // print spaces
}
            
            }
            System.out.println();
        }
        System.out.println();System.out.println();System.out.println();
        //third pattern
        int k = 9;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                if (i == j || i + j == k + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");  // print spaces
                }
            }
            System.out.println();
        }
        

        }
    }

