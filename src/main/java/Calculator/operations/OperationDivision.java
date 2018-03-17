package Calculator.operations;

import Calculator.myoperation.OperationException;

/**
 * Create by Zubritskiy Dmitriy on 11.03.2018
 * @author Zubritskiy Dmitriy
 * Операция Деление
 */
public class OperationDivision implements Operation{

    @Override
    public double execution(double numberOne, double numberTwo) throws OperationException {

        if (numberTwo==0){
            throw new OperationException("Деление на 0");
        }
        return numberOne / numberTwo;
    }
}
