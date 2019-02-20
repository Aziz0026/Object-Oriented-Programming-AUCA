import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstWord, secondWord;

        int testCases = sc.nextInt();

        char[][] letters = new char[2][];

        for (int i = 0; i < testCases; i++) {
            firstWord = sc.next();
            secondWord = sc.next();

            letters[0] = firstWord.toCharArray();
            letters[1] = secondWord.toCharArray();

            char[] word = new char[letters[0].length + letters[1].length];

            for (int j = 0, k = 0; k < letters[0].length; j += 2, k++) {
                word[j] = letters[0][k];
            }

            for (int j = 0, k = 0; j < word.length; j++) {
                if (word[j] == 0) {
                    word[j] = letters[1][k];
                    k++;
                }
            }

            System.out.println(word);
        }
    }
}
