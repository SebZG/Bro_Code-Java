public class Main {

    public static void main(String[] args) {
        // super = Refers to the parent class (subclass <- superclass)
        //               Used in constructors and method overriding
        //               Calls the parent constructor to initialize attributes

        Person person = new Person("Harry", "Potter");
        Student student = new Student("Ron", "Weasley", 3.3);
        Employee employee = new Employee("Hermione", "Granger", 100000);

        person.showName();
        student.showName();
        System.out.println(student.gpa);
        student.showGpa();
        employee.showName();
        employee.showSalary();
    }
}
