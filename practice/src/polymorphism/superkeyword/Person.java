package polymorphism.superkeyword;

public class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Emp extends Person {
    float salary;
    Emp (int id, String name){
        super(id, name);
    }
    Emp(int id, String name , float salary){
         super(id, name); // reusing parent constructor
         this.salary = salary;
    }
    void display () {
        System.out.println("ID : "+id +"  name : "+name+" salary: "+salary);
    }

    public static void main(String[] args) {
        Emp emp1 = new Emp(45, "Sandeep");
        emp1.salary=121;
        emp1.display();
    }
}
