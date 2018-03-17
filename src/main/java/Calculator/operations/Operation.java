package Calculator.operations;

import Calculator.Calculator;
import Calculator.myoperation.OperationException;

/**
 * Create by Zubritskiy Dmitriy on 11.03.2018
 * @author Zubritskiy Dmitriy
 * Интерфейс Operation олицетворяет классы, выполняющие некую операцию над
двумя аргументами.
 */
public interface Operation {
    double execution (double numberOne, double numberTwo) throws OperationException;

}
