package Calculator;

import java.util.Scanner;

/**
 * Create by Zubritskiy Dmitriy on 11.03.2018
 * @author Zubritskiy Dmitriy
 * @see #execution()
 * @see #Calculator(MyOperation)
 *
 */

public class Calculator {

    MyOperation myOperation;

    public Calculator(MyOperation myOperation){
        this.myOperation = myOperation;
    }
    //  Обеспечивает цикл ввода аргументов и вида операции
    //  и вывод результата операции
    public void execution(){

        boolean nextStep = true;                //  Условие выхода из цикла
        boolean p = true;
        double buffer = 0;
        Scanner in = new Scanner(System.in);    //  Объявление потока ввода
        do {



            EnteringNumber enteringNumber = new EnteringNumber();
            enteringNumber.EnteringNumber1(); //ввод первого числа


            //  Ввод операции
            System.out.println("Выберите операцию:");
            System.out.print("0 - сумма\t");
            System.out.print("1 - разность\t");
            System.out.print("2 - уменожение\t");
            System.out.print("3 - деление");
            System.out.println();
            int operation = in.nextInt();

            //  Ввод второго агрумента
            enteringNumber.EnteringNumber2(); //ввод второго числа

            //  Обработка операций над аргемунтами
            System.out.print("Результат равен:\t");
            Operation op = myOperation.getOperationInterface(operation);
            if (op != null){
                System.out.println(op.execution(enteringNumber.getNumber1(), enteringNumber.getNumber2()));

            }
            else System.out.println("Недопустимая операция!!!");


            // Проверка на выход из цикла
            System.out.println("Хотите продолжить?");
            System.out.print("1 - Продолжить\t");
            System.out.println("2 - Выйти");
            int whatDo = in.nextInt();
            if (whatDo == 2)
                nextStep = false;
        } while (nextStep);
    }
}
