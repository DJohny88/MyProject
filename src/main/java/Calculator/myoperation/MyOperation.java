package Calculator.myoperation;

import Calculator.operations.*;

/**
 * Create by Zubritskiy Dmitriy on 11.03.2018
 * @author Zubritskiy Dmitriy
 * Получает код операции, по которому создает соответствующий объект операции
 */
public class MyOperation implements SelectAnOperation {

    int operationCode;
    private Operation operation;


    @Override
    public Operation getOperationInterface(int op) {
        this.operationCode = op;
        switch (operationCode){
            case 1:{
                operation = new OperationPlus();
                break;
            }
            case 2:{
                operation = new OperationMinus();
                break;
            }
            case 3:{
                operation = new OperationMultiply();
                break;
            }
            case 4:{
                operation = new OperationDivision();
                break;
            }
            default:{
                operation = null;

            }
        }
        return operation;
    }
}
