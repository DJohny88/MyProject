package Calculator;

import Calculator.myoperation.MyOperationFactory;
import Calculator.myoperation.OperationException;
import Calculator.operations.Operation;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create by Zubritskiy Dmitriy on 11.03.2018
 * @author Zubritskiy Dmitriy
 * @see #execution()
 * @see #Calculator(MyOperationFactory)
 *
 */

public class Calculator {

    private void InputOperation(){
        System.out.println("Выберите операцию:");
        System.out.print("1 - сумма\t");
        System.out.print("2 - разность\t");
        System.out.print("3 - уменожение\t");
        System.out.print("4 - деление\n");
    }

    public void InputToContinue(){
        System.out.println("Хотите продолжить?");
        System.out.print("1 - Продолжить\t");
        System.out.println("2 - Выйти");
    }

    MyOperationFactory myOperationFactory;

    public Calculator(MyOperationFactory myOperationFactory){
        this.myOperationFactory = myOperationFactory;
    }
    //  Обеспечивает цикл ввода аргументов и вида операции
    //  и вывод результата операции
    public void execution(){

        boolean nextStep = true;                //  Условие выхода из цикла

        do {



            EnteringNumber enteringNumber = new EnteringNumber();
            enteringNumber.EnteringNumber1(); //ввод первого числа


            //  Ввод операции
            InputOperation();

            boolean flagSelectAnOperation = true;
            int operation = 0;
            do{
                Scanner inOperation = new Scanner(System.in);
                try{
                    operation = inOperation.nextInt();
                    if (operation == 1 || operation ==2 || operation ==3 || operation ==4){
                        flagSelectAnOperation = false;
                    }
                    else{
                        System.out.println("Вы ввели не корректное значение");
                        InputOperation();
                    }

                }
                catch (InputMismatchException e){
                    System.out.println("Вы ввели не корректное значение");
                    InputOperation();
                }

            }
            while (flagSelectAnOperation);


            //  Ввод второго агрумента

                enteringNumber.EnteringNumber2();


            //  Обработка операций над аргемунтами

            try{
                Operation op = myOperationFactory.getOperationInterface(operation);
                if (op != null){
                    double o = op.execution(enteringNumber.getNumber1(), enteringNumber.getNumber2());

                    //System.out.println(op.execution(enteringNumber.getNumber1(), enteringNumber.getNumber2()));
                    System.out.print("Результат равен:\t");
                    System.out.println(o);
                }

            }
            catch (OperationException e){
                System.out.println(e.getMessage());

            }


            // Проверка на выход из цикла
            InputToContinue();

            boolean flagToContinue = true;
            do {
                Scanner in1 = new Scanner(System.in);
                try {
                    int whatDo = in1.nextInt();
                    if (whatDo == 1 ){
                        flagToContinue = false;
                    }
                    else if (whatDo == 2 ){
                        nextStep = false;
                        flagToContinue = false;
                    }
                     else{
                        System.out.println("Вы ввели не корректное значение");
                        InputToContinue();
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Вы ввели не корректное значение");
                    InputToContinue();

                }
            }
            while (flagToContinue);
        } while (nextStep);
    }
}
