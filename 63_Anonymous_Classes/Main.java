public class Main {

    public static void main(String[] args) {
        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                   Add custom behavior without having to create a new class.
        //                   Often used for one time uses (TimerTask, Runnable, callbacks)

        // TalkingDog talkingDog = new TalkingDog();
        // talkingDog.speak();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog() {
            @Override
            void speak() {
                System.out.println("The dog goes bark");
            }
        };

        dog1.speak();
        dog2.speak();
    }
}
