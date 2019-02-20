import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int givenInteger, n = sc.nextInt();

        int[] ledQty = new int[n];

        for (int i = 0; i < n; i++) {
            givenInteger = sc.nextInt();

            char[] numbers = String.valueOf(givenInteger).toCharArray();

            for (char number : numbers) {
                switch (number) {
                    case '0':
                        ledQty[i] += 6;
                        break;
                    case '1':
                        ledQty[i] += 2;
                        break;
                    case '2':
                        ledQty[i] += 5;
                        break;
                    case '3':
                        ledQty[i] += 5;
                        break;
                    case '4':
                        ledQty[i] += 4;
                        break;
                    case '5':
                        ledQty[i] += 5;
                        break;
                    case '6':
                        ledQty[i] += 6;
                        break;
                    case '7':
                        ledQty[i] += 3;
                        break;
                    case '8':
                        ledQty[i] += 7;
                        break;
                    case '9':
                        ledQty[i] += 6;
                        break;
                    default:
                        System.err.println("Something went wrong.");
                        break;
                }
            }
        }

        for (int led : ledQty) {
            System.out.println(led + " leds");
        }
    }
}