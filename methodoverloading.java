class methodoverloading {
   
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    
    void show(int a, int b) {
        System.out.println("Two integers: " + a + " & " + b);
    }

    void show(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        
    }
}

