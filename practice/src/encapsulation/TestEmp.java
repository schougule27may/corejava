package encapsulation;

public class TestEmp {
    public static void main(String[] args) {
        EmployeeEnp employeeEnp = new EmployeeEnp();
        employeeEnp.setName("Sandeepp");
        employeeEnp.setIdNum("EMP000112");
        System.out.println("Emp" +employeeEnp.getIdNum());
    }
}
