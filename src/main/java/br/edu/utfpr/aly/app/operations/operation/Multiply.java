package br.edu.utfpr.aly.app.operations.operation;

import br.edu.utfpr.aly.app.operations.Operation;

public class Multiply extends Operation {

    public Multiply() {
        this.operationName = "MULTIPLICAR";
        this.operationSymbol = "x";
    }

    @Override
    public void calc(double a, double b) {
        this.showResult(a * b);
    }
}
