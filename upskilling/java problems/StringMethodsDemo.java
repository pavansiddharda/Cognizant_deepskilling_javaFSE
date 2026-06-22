public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = " HelloWorld ";
        String str2 = "HELLOWORLD";
        System.out.println("Length: " + str.length());
        System.out.println("Concat: " + str.concat(" Java"));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Char at 1: " + str.charAt(1));
        System.out.println("Is empty: " + str.isEmpty());
        System.out.println("Is blank: " + str.isBlank());
        System.out.println("Substring from 2: " + str.substring(2));
        System.out.println("Substring(2, 7): " + str.substring(2, 7));
        System.out.println("Equals str2: " + str.trim().equals(str2));
        System.out.println("Equals ignore case: " + str.trim().equalsIgnoreCase(str2));
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));
        System.out.println("Contains 'World': " + str.contains("World"));
        System.out.println("Starts with ' He': " + str.startsWith(" He"));
        char ch = str.charAt(1);
        System.out.println("Is UpperCase: " + Character.isUpperCase(ch));
        System.out.println("Is LowerCase: " + Character.isLowerCase(ch));
    }
}
