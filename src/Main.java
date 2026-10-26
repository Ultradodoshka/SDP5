public class Main {
    public static void main(String[] args){
        double a =100;
        double b=10;

        Calculator calculator = new Calculator(new AddStrategy());
        System.out.println("Input: "+a+" and "+b);
        System.out.println("Output: "+calculator.calculate(a,b));

        calculator.setStrategy(new SubstractStrategy());
        System.out.println("Input: "+a+" and "+b);
        System.out.println("Output: "+calculator.calculate(a,b));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("Input: "+a+" and "+b);
        System.out.println("Output: "+calculator.calculate(a,b));

        calculator.setStrategy(new DivisionStrategy());
        System.out.println("Input: "+a+" and "+b);
        System.out.println("Output: "+calculator.calculate(a,b));
    }
}
