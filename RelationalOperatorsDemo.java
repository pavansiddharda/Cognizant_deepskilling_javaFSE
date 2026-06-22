public class RelationalOperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Comparing floating-point numbers
        double x = 5.5, y = 5.5;
        System.out.println("x == y: " + (x == y));

        // Comparing characters
        char c1 = 'A', c2 = 'B';
        System.out.println("c1 < c2: " + (c1 < c2));

        // String comparison
        String str1 = "Hello", str2 = "Hello";
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1.equals(str2): " + str1.equals(str2));
    }
}

