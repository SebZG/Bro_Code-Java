public class Friend {

    static int numOfFriends;
    String name;

    Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void showFriends() {
        System.out.printf("You have %d friend/s!", numOfFriends); // This line will cause an error because 'this' cannot be used in a static context
    }
}
