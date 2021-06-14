package builder;

public class EmployeeBuilder {
    private String name;
    private int age;
    private String idNumber;
    private String mobileNo;

    public EmployeeBuilder setName(String name){
        this.name = name;
        return this;
    }

    public EmployeeBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public EmployeeBuilder setId(String idNumber){
        this.idNumber = idNumber;
        return this;
    }

    public EmployeeBuilder setMobileNo(String mobileNo){
        this.mobileNo = mobileNo;
        return this;
    }

    public Employee getEmployee(){
        return new Employee(name, age, idNumber, mobileNo);
    }
}
