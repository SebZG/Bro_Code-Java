public class Engine {

    String type;

    Engine(String type) {
        this.type = type;
    }

    void start() {
        System.out.printf("You start the %s engine!\n", this.type);
    }
}
