package builder;

public class Runner {
    public static void main(String[] args) {
        Employee emp1 = new EmployeeBuilder().setName("EMP1").getEmployee();
        System.out.println(emp1);
    }
}
