package Collections;


import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Create by Zubritskiy Dmitriy on 19.03.2018
 * @author Zubritskiy Dmitriy
 * Клаас считывает данные из файла, сортиует их и выводит статистику по словам.
 * Также выводит слово встречающееся максимальное количество раз.
 */

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String fileName = "E:\\MyProjects\\example.txt";
        Scanner scanner = new Scanner(new File(fileName));
        Map<String, Integer> statistics = new TreeMap<>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
        }
        System.out.println(statistics);
        String word = "";
        int maxValue = 0;
        for (Map.Entry<String, Integer> str : statistics.entrySet()) {


            if (str.getValue() > maxValue) {
                maxValue = str.getValue();
                word = str.getKey();
            }

        }

        System.out.println("Слово: " + word  +  " встречается " + statistics.get(word) + " раз(а)");

    }


}

