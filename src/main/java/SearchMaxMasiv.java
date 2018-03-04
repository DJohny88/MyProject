import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Create by Zubritskiy Dmitriy on 03.03.2018
 * Основной класс. Точка входа в пограмму
 *@author Zubritskiy Dmitriy
 *
 */
public class SearchMaxMasiv {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размерность массива:");
        int masivLength = Integer.parseInt(rd.readLine());
        int maxWord= 0;
        int count = 0;
        String[] newWord = new String[masivLength];

        for(int i=0; i < newWord.length; i++){
            newWord[i] = rd.readLine();
            if (maxWord < newWord[i].length()){
                maxWord = newWord[i].length();
                count = i;
            }
        }
        System.out.println("Слово c максимальной длиной " + newWord[count] + " : имеет длину: " + maxWord);
    }
}
