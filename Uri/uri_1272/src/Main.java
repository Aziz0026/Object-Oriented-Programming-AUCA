import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int times = Integer.parseInt(reader.readLine());

        for (int i = 0; i < times; i++) {
            String givenLine = reader.readLine();
            StringBuilder result = new StringBuilder();

            givenLine = givenLine.replace("·", " ");

            String[] words = givenLine.trim().split("\\s+");

            for (String word : words) {
                if (word.length() > 0) {
                    result.append(word.charAt(0));
                } else {
                    System.out.println("");
                }
            }

            System.out.println(result);
        }
    }
}
