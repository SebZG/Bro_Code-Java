public class Main {

    public static void main(String[] args) {
        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                                   to be used as objects. "Wrap them in an object"
        //                                   Generally, don't wrap primitives unless you need an object.
        //                                   Allows use of Collections Framework and static utility methods.

        // int a = 123;

        // Boxing = Wrapping a primitive in an object
        // Integer a = new Integer(123);
        // Double b = new Double(3.14);
        // Character c = new Character('$');
        // Boolean d = new Boolean(true);

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;
        String e = "Bro";

        // Unboxing
        int x = a;
        double y = b;
        char z = c;
        boolean t = d;

        // Static utility methods (primitive to string)
        String str1 = Integer.toString(123);
        String str2 = Double.toString(3.14);
        String str3 = Character.toString('$');
        String str4 = Boolean.toString(true);

        String str5 = str1 + str2 + str3 + str4;

        System.out.println(str5);

        // Static utility methods (string to primitive)
        int num1 = Integer.parseInt("123");
        double num2 = Double.parseDouble("3.14");
        char char1 = "hello".charAt(0); // Not related to wrapper classes
        boolean bool = Boolean.parseBoolean("true");

        // String str6 = num1 + num2 + char1 + bool; // Won't work

        // Other static utility methods
        char letter = '$';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

    }
}
