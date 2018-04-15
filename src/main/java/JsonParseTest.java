import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParseTest {

    private static final String filePath = "C:\\Users\\Dmitriy\\Documents\\example.json";

    public static void main(String[] args) {

        try {
            // read the json file
            FileReader reader = new FileReader(filePath);

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            // get a String from the JSON object
            String masterQuestion = (String) jsonObject.get("master_question");
            System.out.println("Тематика: " + masterQuestion);

            String answer = (String) jsonObject.get("answer");
            System.out.println("Ответ: " + answer);

            // get an array from the JSON object
            JSONArray questionsPositive= (JSONArray) jsonObject.get("questions_positive");
            JSONArray questionsNegative= (JSONArray) jsonObject.get("questions_negative");
            // take the elements of the json array
            for(int i=0; i<questionsPositive.size(); i++){
                System.out.println(i + " элемент в массиве позитивных вопросов: "+questionsPositive.get(i));
            }
            //Iterator i = questionsPositive.iterator();

            for(int j=0; j<questionsNegative.size(); j++){
                System.out.println(j + " элемент в массиве негативных вопросов: "+questionsNegative.get(j));
            }
            //Iterator j = questionsNegative.iterator();


        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }

    }

}