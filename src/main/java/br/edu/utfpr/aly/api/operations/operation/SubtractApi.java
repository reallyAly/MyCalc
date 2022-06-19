package br.edu.utfpr.aly.api.operations.operation;

import br.edu.utfpr.aly.api.operations.OperationApi;

public class SubtractApi extends OperationApi {

    public SubtractApi() {
        this.operationName = "SUBTRAIR";
        this.operationSymbol = "-";
    }

    @Override
    public void calc(double a, double b) {
        this.result = a - b;
    }

}
