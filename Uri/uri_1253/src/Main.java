import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int testCases, shift;

        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            String givenWord = sc.next();

            shift = sc.nextInt();

            char[] letters = new char[givenWord.length()];

            for (int j = 0; j < givenWord.length(); j++) {
                int z = ((int) givenWord.charAt(j) - shift);

                if (z < 65) {
                    z = z + 26;
                }

                letters[j] = (char) z;

                System.out.print(letters[j]);
            }
        }
    }
}
