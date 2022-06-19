package br.edu.utfpr.aly.api.operations.operation;

import br.edu.utfpr.aly.api.operations.OperationApi;

public class DivideApi extends OperationApi {
    @Override
    public void calc(double a, double b) {
        this.result = a / b;
    }
}
