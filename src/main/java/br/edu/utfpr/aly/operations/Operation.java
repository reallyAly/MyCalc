package br.edu.utfpr.aly.operations;

import br.edu.utfpr.aly.calculator.Result;

public abstract class Operation extends Result  {

    protected String operationSymbol;

    protected String operationName;

    protected double firstNumber;

    protected double secondNumber;

    public String getOperationSymbol() {
        return operationSymbol;
    }

    public void setOperationSymbol(String operationSymbol) {
        this.operationSymbol = operationSymbol;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationNumber(String operationName) {
        this.operationName = operationName;
    }

    public abstract void calc(double a, double b);
}