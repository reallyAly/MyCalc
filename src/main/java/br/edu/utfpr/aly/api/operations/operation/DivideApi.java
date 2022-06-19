package br.edu.utfpr.aly.api.operations.operation;

import br.edu.utfpr.aly.api.operations.OperationApi;

public class DivideApi extends OperationApi {

    public DivideApi() {
        this.operationName = "DIVIDIR";
        this.operationSymbol = "/";
    }

    @Override
    public void calc(double a, double b) throws ArithmeticException {

        if(b <= 0){
            throw new ArithmeticException("Não é permitido dividir um número por zero");
        }

        this.result = a / b;
    }
}
