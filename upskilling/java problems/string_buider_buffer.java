//string buffer asyncronised and thread safe
public class string_buider_buffer{
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial String: " + sb);
        // 1. append() → add text at the end
        sb.append(" World");
        System.out.println("After append: " + sb);
        // 2. insert() → insert text at a given position
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);
        // 3. replace() → replace part of the string
        sb.replace(6, 10, "Python"); // replaces "Java" with "Python"
        System.out.println("After replace: " + sb);
        // 4. delete() → remove part of the string
        sb.delete(6, 12); // deletes "Python"
        System.out.println("After delete: " + sb);
        // 5. deleteCharAt() → remove single character
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);
        // 6. reverse() → reverse the whole string
        sb.reverse();
        System.out.println("After reverse: " + sb);
        // 7. capacity() → current buffer capacity
        System.out.println("Capacity: " + sb.capacity());
        // 8. length() → number of characters
        System.out.println("Length: " + sb.length());
        // 9. setCharAt() → change a character
        sb.setCharAt(0, 'X');
        System.out.println("After setCharAt: " + sb);
        // 10. substring() → extract a substring
        String sub = sb.substring(0, 5);
        System.out.println("Substring (0,5): " + sub);
        // 11. ensureCapacity() → expand buffer if needed
        sb.ensureCapacity(100);
        System.out.println("Capacity after ensureCapacity(100): " + sb.capacity());
        // 12. trimToSize() → minimize capacity to current length
        sb.trimToSize();
        System.out.println("Capacity after trimToSize(): " + sb.capacity());
    }
}

