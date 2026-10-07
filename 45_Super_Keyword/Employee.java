public class Employee extends Person {

    int salary;

    Employee(String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }

    void showSalary() {
        System.out.printf("%s/s salary: %d\n", this.first, this.salary);
    }
}
