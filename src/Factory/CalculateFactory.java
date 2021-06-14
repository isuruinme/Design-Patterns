package Factory;

public class CalculateFactory {
    public Calculate getCalculation(String type){
        //SuperClass obj = new SubClass()
        Calculate obj = null;
        if (type.equals("+")){
            obj = new Add();
        }else if (type.equals("-")){
            obj = new Sub();
        }else{
            System.out.println("Invalid parameters");
        }
        return obj;
    }
}

