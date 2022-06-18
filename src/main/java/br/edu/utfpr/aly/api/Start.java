package br.edu.utfpr.aly.api;

import br.edu.utfpr.aly.operations.Operation;
import io.javalin.Javalin;
import br.edu.utfpr.aly.operations.Operations;
import br.edu.utfpr.aly.operations.operation.*;
import br.edu.utfpr.aly.Calculator;

import java.util.HashMap;
import java.util.Map;

public class Start {
    public static void main(String[] args) {

        Operations operations = new Operations();

        operations.addOperation(new Sum());
        operations.addOperation(new Subtract());
        operations.addOperation(new Multiply());
        operations.addOperation(new Divide());

        Javalin app = Javalin.create().start(7070);

        /* Listing all operations */
        app.get("/operations", ctx -> {

            Map<String, String> resultOps = new HashMap<String, String>();

            for(Operation op: operations.getOperations()) {
                resultOps.put(op.getOperationSymbol(), op.getOperationName());
            }

            ctx.json(resultOps);
        });
    }
}
