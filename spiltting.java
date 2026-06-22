public class spiltting {
    public static void main(String[] args) {
        String s="apple,banana,grapes";
        String[] fruits=s.split(",");
        for(String fruit:fruits){
            System.out.println(fruit);
        }
String joined=String.join("-","java","python","c++");
    }
}
