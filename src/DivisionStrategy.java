public class DivisionStrategy implements OperationStrategy {
    @Override
    public double execute(double a, double b) {
        if(b==0){
            throw new ArithmeticException("Division by zero");
        }
        return a/b;
    }
}
