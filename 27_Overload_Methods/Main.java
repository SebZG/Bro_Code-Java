public class Main {

    public static void main(String[] args) {
        // Overloads - Methods that share the same name
        //             But different parameters
        //             Signature = name + parameters

        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }
}
