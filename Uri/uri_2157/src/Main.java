import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int times = Integer.parseInt(reader.readLine());

        for (int i = 0; i < times; i++) {
            String[] givenLine = reader.readLine().split("\\s");

            int a = Integer.parseInt(givenLine[0]);
            int b = Integer.parseInt(givenLine[1]);

            StringBuilder result = new StringBuilder();
            for (int j = a, k = 0; j <= b; j++, k++) {
                result.append(j);
            }

            System.out.print(result);
            System.out.println(result.reverse());
        }
    }
}
