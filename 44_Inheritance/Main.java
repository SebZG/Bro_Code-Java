public class Main {

    public static void main(String[] args) {
        // Inheritance = One class inherits the attributes and methods
        //                         from another class.
        //                         Child <- Parent <- GrandParent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        dog.eat();

        System.out.println(cat.isAlive);
        cat.eat();

        System.out.println(cat.lives);
        System.out.println(dog.lives);

        cat.speak();
        dog.speak();

        System.out.println(cat.isAlive);
        System.out.println(dog.isAlive);
        plant.photosynthesize();
        System.out.println(plant.isAlive);
    }
}
