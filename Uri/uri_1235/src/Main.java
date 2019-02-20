import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int times = Integer.parseInt(in.readLine());

        for (int i = 0; i < times; i++) {
            String givenLine = in.readLine();

            String firstHalf = givenLine.substring(0, givenLine.length() / 2);
            String secondHalf = givenLine.substring(givenLine.length() / 2, givenLine.length());

            for (int j = firstHalf.length() - 1; j >= 0; j--) {
                System.out.print(firstHalf.charAt(j));
            }

            for (int j = secondHalf.length() - 1; j >= 0; j--) {
                System.out.print(secondHalf.charAt(j));
            }

            System.out.println();
        }
    }
}
