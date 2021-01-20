package polymorphism.fianalkeyword;

public class Employee {

    final String PAN_NUMBER;

    Employee(String panNumber) {
        PAN_NUMBER = panNumber;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("SA-12345");
       // emp1.PAN_NUMBER="Changed";
        Employee emp2= new Employee("SAN-12345");
    }
}
