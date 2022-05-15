package operations.operation;

import operations.Operation;

public class Divide extends Operation {

    public Divide() {
        this.operationName = "DIVIDIR";
        this.operationSymbol = "/";
    }

    @Override
    public void calc(double a, double b) {
        this.showResult(a / b);
    }
}
