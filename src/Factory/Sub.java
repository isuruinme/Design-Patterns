package Factory;

public class Sub implements Calculate {
    @Override
    public void calculate(double a, double b) {
        System.out.println("Answer is :"+ (a-b));
    }
}
