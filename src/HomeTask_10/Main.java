package HomeTask_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("InputText.txt"));
            String text = reader.readLine();

            splitString(text);
        } catch (IOException e) {
            System.out.println("File is not exist, please create file");
        }
    }

    private static void splitString(String text) {
        String[] stringArray = text.split("\\.");
        try (FileWriter addWords = new FileWriter("OutputText.txt")) {

            String[] array = text.split(" ");
            for (String words : array) {
                addWords.write(words + "");
                addWords.write("\n");
            }

//          UpperCase after "."
            for (int i = 0; i < stringArray.length; i++) {
                String result = (Character.toUpperCase(stringArray[i].trim().
                        charAt(0)) + stringArray[i].trim().substring(1) + ". ");

                addWords.write(result);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}