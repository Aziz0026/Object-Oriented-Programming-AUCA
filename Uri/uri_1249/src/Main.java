import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String input = sc.nextLine();

            if (input.equals("")) {
                break;
            }

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c >= 'a' && c <= 'm') c += 13;
                else if (c >= 'A' && c <= 'M') c += 13;
                else if (c >= 'n' && c <= 'z') c -= 13;
                else if (c >= 'N' && c <= 'Z') c -= 13;
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

