class Parent {
    Parent() {
        System.out.println("Parent Default");
    }

    Parent(int a) {
        System.out.println("Parent Parameterized");
    }
}
class Child extends Parent {
    Child() {
        super();      
    }
    Child(int x) {
        super(x);     
    }
    public static void main(String[] args) {
        Child c1 = new Child();
        Child c2 = new Child(10);
    }
}
