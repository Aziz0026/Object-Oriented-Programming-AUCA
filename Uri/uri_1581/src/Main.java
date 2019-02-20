import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int times = Integer.parseInt(reader.readLine());

        for (int i = 0; i < times; i++) {
            boolean check = false;
            String tmp = "", language = "";

            int personQty = Integer.parseInt(reader.readLine());

            for (int j = 0; j < personQty; j++) {
                language = reader.readLine().trim();

                if (j == 0) {
                    tmp = language;
                }

                if (!tmp.equals(language)) {
                    check = true;
                }
            }

            if (check) {
                System.out.println("ingles");
            } else {
                System.out.println(language);
            }
        }
    }
}
