package operations.operation;

import operations.Operation;

public class Sum extends Operation {

    public Sum() {
        this.operationName= "SOMA";
        this.operationSymbol = "+";
    }

    @Override
    public void calc(double a, double b) {
        this.showResult(a + b);
    }
}
