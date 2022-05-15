import operations.Operation;
import operations.operation.Divide;
import operations.operation.Multiply;
import operations.operation.Subtract;
import operations.operation.Sum;
import operations.Operations;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        Operations op = new Operations();

        op.addOperation(new Sum());
        op.addOperation(new Multiply());
        op.addOperation(new Divide());
        op.addOperation(new Subtract());

        Calculator calc = new Calculator(op);

        int flag = 0;

        do{
            System.out.println("Insira o primeiro valor");
            double firstValue = reader.nextDouble();

            System.out.println("Insira o operador desejado");

            for (Operation operation : op.getOperations()) {
                System.out.println(operation.getOperationName()+" => "+operation.getOperationSymbol());
            }

            calc.setOperator(reader.next());

            System.out.println("Insira o segundo valor");
            double secondValue = reader.nextDouble();

            calc.calculate(firstValue, secondValue);

            System.out.println("Deseja realizar outra operação? 1 - SIM | 0 - SAIR");
            flag = reader.nextInt();

        }while(flag == 1);

    }

}
