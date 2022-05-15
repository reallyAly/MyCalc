package operations;

import operations.Operation;

import java.util.ArrayList;

public class Operations {
    private ArrayList<Operation> operations = new ArrayList<>();

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public void addOperation(Operation op) {
        this.operations.add(op);
    }
}