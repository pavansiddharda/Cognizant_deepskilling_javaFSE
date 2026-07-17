class parent{
    parent(){
        System.out.println("parent constructor");
    }
    parent(int a){
        System.out.println("parent constructor with parameter");
    }
    parent(int a,int b){
        System.out.println("parent constructor with two parameters");
    }
    private int a=10;
    protected int b=20;
    public int c=30;
}
class accessmodifiers extends parent{
    accessmodifiers() {
        super();
    }

    accessmodifiers(int x) {
        super(x);
    }

    accessmodifiers(int x, int y) {
        super(x, y);
    }
    public static void main(String[] args) {
        accessmodifiers obj=new accessmodifiers();
        //System.out.println(obj.a); 
        System.out.println(obj.b); 
        System.out.println(obj.c);
        accessmodifiers obj1=new accessmodifiers(10);
        accessmodifiers obj2=new accessmodifiers(10, 20);
    }
}