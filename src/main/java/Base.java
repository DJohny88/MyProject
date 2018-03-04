import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create by Zubritskiy Dmitriy on 04.03.2018
 *@author Zubritskiy Dmitriy
 *
 */
public class Base {
    public static void main(String[] args) throws IOException{
        System.out.println("Выберите операцию: (1- Калькулятор, 2 - Поиск максимального числа в массиве)");
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(rd.readLine());

        if (num == 1){
          new Calculator().CalculatorMain();
        }
        else if (num == 2){
            SearchMaxMasiv.main(args);
        }
    }
}
