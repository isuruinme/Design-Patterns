package builder;

public class Employee {
    private String name;
    private int age;
    private String idNumber;
    private String mobileNo;

    public Employee(String name, int age, String idNumber, String mobileNo){
        super();
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString(){
        return "Employee [name= "+ name + " age= " + age + " ID= " + idNumber + " Mobile= " + mobileNo +"]";
    }
}
