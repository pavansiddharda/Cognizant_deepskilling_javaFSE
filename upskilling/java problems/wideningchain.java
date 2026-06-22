public class wideningchain {
    public static void main(String[] args){
        byte b1=12;
        short b2=b1;
        int i=b2;
        long l=i;
        System.out.println("byte value:"+b1);
        System.out.println("short value:"+b2);
        System.out.println("int value:"+i);
        System.out.println("long value:"+l);
    }
    
}
