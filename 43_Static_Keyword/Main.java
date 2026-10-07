public class Main {

    public static void main(String[] args) {
        // static = Modifies a variable or method belong to the class,
        //               rather than to any specific object.
        //               Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Michael Jackson");
        Friend friend2 = new Friend("Bro Code");

        // System.out.println(friend1.numOfFriends);
        // System.out.println(friend2.numOfFriends);
        System.out.println(Friend.numOfFriends);

        Friend.showFriends();

        // .round() is a static method of the Main class,
        // so we can call it without creating an object of the Main class
        Math.round(3.99);
    }
}
