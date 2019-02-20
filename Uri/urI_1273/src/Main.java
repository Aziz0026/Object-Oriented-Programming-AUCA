import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int times;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while ((times = Integer.parseInt(reader.readLine())) != 0) {
            int longestWordLength = 0;
            String[] words = new String[times];

            for (int i = 0; i < times; i++) {
                String givenWord = reader.readLine().trim();

                if (givenWord.length() > longestWordLength) {
                    longestWordLength = givenWord.length();
                }

                words[i] = givenWord.trim();
            }

            for (int i = 0; i < times; i++) {
                int numberOfSpaces = longestWordLength - words[i].length();

                if (numberOfSpaces == 0) {
                    System.out.println(words[i]);
                } else {
                    printSpaces(numberOfSpaces);
                    System.out.println(words[i]);
                }
            }

            System.out.println();
        }
    }

    private static void printSpaces(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(" ");
        }
    }
}
