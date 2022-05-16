package operations.operation;

import operations.Operation;

public class Divide extends Operation {

    public Divide() {
        this.operationName = "DIVIDIR";
        this.operationSymbol = "/";
    }

    @Override
    public void calc(double a, double b) {

        if(b <= 0){
            throw new ArithmeticException("Não é permitido dividir um número por zero");
        }

        this.showResult(a / b);
    }
}
