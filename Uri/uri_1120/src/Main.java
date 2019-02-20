import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line;

        while (!(line = sc.nextLine()).equals("0 0")) {
            String[] numbers = line.split("\\s");

            String firstInteger = numbers[0];
            String secondInteger = numbers[1];

            String result = secondInteger.replace(firstInteger, "");
            result = result.replaceFirst("0*", "");

            System.out.println(result.length() > 0 ? result : 0);
        }
    }
}
