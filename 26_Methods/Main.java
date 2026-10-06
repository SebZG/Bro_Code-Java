public class Main {

    public static void main(String[] args) {
        // Method - a block of reusable code that belongs to a class

        String name = "Bro";
        int age = 35;
        int num = 5;
        String first = "Bro";
        String last = "Code";

        happyBirthday(name, age);
        System.out.println(square(num));
        System.out.println(cube(num));
        System.out.println(getFullName(first, last));
        System.out.println(ageCheck(age));
    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy %d years!\n", age);
        System.out.printf("Happy birthday dear, %s!\n", name);
        System.out.println("Happy birthday to you!");
    }

    static double square(double num) {
        return num * num;
    }

    static double cube(double num) {
        return num * num * num;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
