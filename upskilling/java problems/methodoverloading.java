class show {
   
    void show(int a) {
        System.out.println("Integer: " + a);
    }
    void show(int a, int b) {
        System.out.println("Two integers: " + a + " & " + b);
    }
    void show(String s) {
        System.out.println("String: " + s);
    }
    void show(String s,int a) {
        System.out.println("String: " + s + " and Integer: " + a);
    }
    void show(int a,String s) {
        System.out.println("Integer: " + a + " and String: " + s);
    }

    public static void main(String[] args) {
        
    }
}
class methodoverloading{
    public static void main(String[] args) {
        show obj = new show();
        obj.show(10);
        obj.show(20, 30);
        obj.show("Hello");
        obj.show("hello",10);
        obj.show(10,"hello");
    }
}

