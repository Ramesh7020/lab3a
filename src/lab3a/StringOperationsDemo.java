package lab3a;
public class StringOperationsDemo {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        System.out.println("=== String Creation and Basic Operations ===");
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // 2. Length and Character Access
        System.out.println("\n=== Length and Character Access ===");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 4: " + str1.charAt(4));

        // 3. String Comparison
        System.out.println("\n=== String Comparison ===");
        String str3 = "hello, world!";
        System.out.println("Equals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));
        System.out.println("CompareTo: " + str1.compareTo(str3));

        // 4. String Searching
        System.out.println("\n=== String Searching ===");
        System.out.println("Index of 'World': " + str1.indexOf("World"));
        System.out.println("Last index of 'o': " + str1.lastIndexOf('o'));
        System.out.println("Contains 'Hello': " + str1.contains("Hello"));

        // 5. Substring Operations
        System.out.println("\n=== Substring Operations ===");
        System.out.println("Substring (7 to end): " + str1.substring(7));
        System.out.println("Substring (0 to 5): " + str1.substring(0, 5));

        // 6. String Modification
        System.out.println("\n=== String Modification ===");
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Replace World with Java: " + str1.replace("World", "Java"));

        // 7. Whitespace Handling
        System.out.println("\n=== Whitespace Handling ===");
        String spaced = "  Java Example  ";
        System.out.println("Original: '" + spaced + "'");
        System.out.println("Trimmed: '" + spaced.trim() + "'");

        // 8. String Concatenation
        System.out.println("\n=== String Concatenation ===");
        String a = "Hello";
        String b = "Java";
        System.out.println("Using +: " + a + " " + b);
        System.out.println("Using concat(): " + a.concat(" ").concat(b));

        // 9. String Splitting
        System.out.println("\n=== String Splitting ===");
        String csv = "Java,Python,C++,JavaScript";
        String[] langs = csv.split(",");
        for (int i = 0; i < langs.length; i++) {
            System.out.println("Language " + (i + 1) + ": " + langs[i]);
        }

        // 10. StringBuilder Demo
        System.out.println("\n=== StringBuilder Demo ===");
        StringBuilder sb = new StringBuilder();
        sb.append("Learning ");
        sb.append("Java ");
        sb.append("Programming");
        System.out.println("Result: " + sb.toString());

        sb.insert(9, "Core ");
        System.out.println("After Insert: " + sb.toString());

        sb.reverse();
        System.out.println("After Reverse: " + sb.toString());

        // 11. String Formatting
        System.out.println("\n=== String Formatting ===");
        String formatted = String.format("Name: %s, Age: %d, Marks: %.2f", "Ravi", 20, 85.75);
        System.out.println(formatted);

        // 12. Email Validation
        System.out.println("\n=== Email Validation ===");
        String email = "student@example.com";

        boolean isValid = validateEmail(email);
        System.out.println("Email: " + email);
        System.out.println("Valid: " + isValid);
    }

    // Email Validation Method
    public static boolean validateEmail(String email) {
        return email.contains("@") &&
               email.contains(".") &&
               !email.startsWith("@") &&
               !email.endsWith(".") &&
               email.indexOf("@") < email.lastIndexOf(".");
    }
}