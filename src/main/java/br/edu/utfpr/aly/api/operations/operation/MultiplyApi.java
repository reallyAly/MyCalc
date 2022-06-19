package br.edu.utfpr.aly.api.operations.operation;

import br.edu.utfpr.aly.api.operations.OperationApi;

public class MultiplyApi extends OperationApi {

    public MultiplyApi() {
        this.operationName = "MULTIPLICAR";
        this.operationSymbol = "x";
    }

    @Override
    public void calc(double a, double b) {
        this.result = a * b;
    }

}
