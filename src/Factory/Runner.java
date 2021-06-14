package Factory;

public class Runner {
    public static void main(String[] args) {
        CalculateFactory factory = new CalculateFactory();
        Calculate calc = factory.getCalculation("-");
        calc.calculate(10,5);
    }
}
