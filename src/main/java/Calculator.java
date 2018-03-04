import java.lang.String;
import java.util.Scanner;

/**
 * Create by Zubritskiy Dmitriy on 02.03.2018
 * @author Zubritskiy Dmitriy
 * @see #getDoubleOne()
 * @see #getDoubleTwo()
 * @see #getOperation()
 * @see #calculate(double, double, char)
 */

public class Calculator {
   static Scanner scanner = new Scanner(System.in);

    /**
     * Функция считывает числа с клавиатуы и соверщает над ними выбраныую операцию
     */
        public void CalculatorMain(){
       double numberOne = getDoubleOne();
       double numberTwo = getDoubleTwo();
       char operation = getOperation();
       double result = calculate(numberOne, numberTwo, operation);
        System.out.print("Результат операции равен: ");
        System.out.printf("%.4f", result); //Вывод результата с учетом форматирования (4 знака после запятой)
    }

    /**
     *
     * @return double number1 возрашает первое введено число
     */
    public  double getDoubleOne(){
        System.out.println("Введите первое число:");
        double number1;
        if(scanner.hasNextDouble()){
            number1 = scanner.nextDouble();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            number1 = getDoubleOne();
        }
        return number1;
    }

    /**
     *
     * @return double number2 возрашает второе введено число
     */

    public  double getDoubleTwo(){
        System.out.println("Введите второе число:");
        double number2;
        if(scanner.hasNextDouble()){
            number2 = scanner.nextDouble();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            number2 = getDoubleTwo();
        }
        return number2;
    }

    /**
     *
     * @return char operation возрашает символ операции (+ - / *)
     */
    public  char getOperation(){
        System.out.println("Введите символ операции(+ - / *):");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    /**
     *
     * @param numberOne double value
     * @param numberTwo double value
     * @param operation char value
     * @return double result возвращает результат обработки операции между первым и вторым введеным числом
     */
    public double calculate(double numberOne, double numberTwo, char operation){
        double result;
        switch (operation){
            case '+':
                result = numberOne+numberTwo;
                break;
            case '-':
                result = numberOne-numberTwo;
                break;
            case '*':
                result = numberOne*numberTwo;
                break;
            case '/':
                result = numberOne/numberTwo;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calculate(numberOne, numberTwo, getOperation());//рекурсия
        }
        return result;
    }

}

