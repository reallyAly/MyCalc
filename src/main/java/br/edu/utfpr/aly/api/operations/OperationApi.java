package br.edu.utfpr.aly.api.operations;

import br.edu.utfpr.aly.app.operations.Operation;

public abstract class OperationApi extends Operation {
    protected double result;

    public double getResult()
    {
        return this.result;
    }
}
