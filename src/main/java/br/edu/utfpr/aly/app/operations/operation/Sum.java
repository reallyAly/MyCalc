package br.edu.utfpr.aly.app.operations.operation;

import br.edu.utfpr.aly.app.operations.Operation;

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
