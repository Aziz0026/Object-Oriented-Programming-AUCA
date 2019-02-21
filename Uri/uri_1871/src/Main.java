import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sum = "";

        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a != 0 && b != 0) {
                String[] result;

                sum += String.valueOf(a + b);

                result = sum.split("0");

                for (String aResult : result) {
                    System.out.print(aResult);
                }

                System.out.println();
            } else {
                break;
            }

            sum = "";
        }
    }
}
