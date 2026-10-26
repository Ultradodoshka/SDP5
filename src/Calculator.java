public class Calculator {
    private OperationStrategy strategy;
    public Calculator(OperationStrategy strategy){
        this.strategy= strategy;
    }

    public void setStrategy(OperationStrategy strategy){
        this.strategy=strategy;
    }

    public double calculate(double a, double b){
        if(strategy==null){
            throw new IllegalStateException("Set the strategy");
        }
        return strategy.execute(a, b);
    }
}
