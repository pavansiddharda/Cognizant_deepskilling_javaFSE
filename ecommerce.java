public class ecommerce {
    public static void main(String[]args){
        int[] prices={10000,7500,15600,5000,3500,3699,2000,1799,4599,9000};
        int k=1;
        for(int i=0;i<prices.length;i++){
            System.out.println("product "+k+":"+prices[i]);
            k++;
        }
        int temp;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length-i;j++){
                if(prices[i]>prices[j]){
                temp=prices[i];
                prices[i]=prices[j];
                prices[j]=temp;
                
                }
            }
            
        }
        for(int i=0;i<prices.length;i++){
            System.out.print(prices[i]+" ");
    }
    System.out.println();
    System.out.println("max element:"+prices[9]);
    System.out.println("min element:"+prices[0]);
    for(int i=0;i<prices.length;i++){
        if(prices[i]>=5000){
            System.out.println("product "+i+" got 10 percent discount");

        }
    }
}
}
