package br.edu.utfpr.aly.api.operations.operation;

import br.edu.utfpr.aly.api.operations.OperationApi;

public class SumApi extends OperationApi{

    public SumApi() {
        this.operationName= "SOMA";
        this.operationSymbol = "+";
    }

    @Override
    public void calc(double a, double b) {
        this.result = a + b;
    }
}
