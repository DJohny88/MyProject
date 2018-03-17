package Calculator;

import Calculator.myoperation.MyOperation;

/**
 * Create by Zubritskiy Dmitriy on 11.03.2018
 * @author Zubritskiy Dmitriy
 * Основной класс пограммы
 */
public class ConsoleCalculator {
    public static void main(String[] args) {
        //Создаем экземпляр класса MyOperation
        MyOperation myOperation = new MyOperation();
        //Создаем экземпляр класса Calculator
        Calculator calc = new Calculator(myOperation);
        calc.execution();
    }
}
