package operations.operation;

import operations.Operation;

public class Subtract extends Operation {

    public Subtract() {
        this.operationName = "SUBTRAIR";
        this.operationSymbol = "-";
    }

    @Override
    public void calc(double a, double b) {
        this.showResult(a - b);
    }
}
