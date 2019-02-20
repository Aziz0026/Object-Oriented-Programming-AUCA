import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a, b;

        Scanner sc = new Scanner(System.in);

        int times = sc.nextInt();

        for (int i = 0; i < times; i++) {
            a = sc.next();
            b = sc.next();

            int firstLength = a.length();
            int secondLength = b.length();

            if (firstLength < secondLength) {
                System.out.println("nao encaixa");
            } else {
                System.out.println(a.substring(firstLength - secondLength, firstLength).equals(b) ? "encaixa" : "nao encaixa");
            }
        }
    }
}
