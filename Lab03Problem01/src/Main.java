import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = true;

        Rational result = new Rational(1, 1);

        System.out.println("Calculator of Rational numbers");

        while (exit) {
            System.out.print("Enter 1st rational (Ctrl-Z: exit): ");

            String[] firstRational = sc.nextLine().trim().split("/");

            Rational a = new Rational(
                    firstRational[0],
                    firstRational[1]
            );

            System.out.print("Enter operator: ");

            String operator = sc.nextLine().trim();

            System.out.print("Enter 2nd rational (Ctrl-Z: exit): ");

            String[] secondRational = sc.nextLine().split("/");

            Rational b = new Rational(
                    secondRational[0],
                    secondRational[1]
            );

            switch (operator) {
                case "+":
                    result = a.add(b);
                    printResult(a, operator, b, result);
                    break;
                case "-":
                    result = a.subtract(b);
                    printResult(a, operator, b, result);
                    break;
                case "*":
                    result = a.multiply(b);
                    printResult(a, operator, b, result);
                    break;
                case "/":
                    result = a.divide(b);
                    printResult(a, operator, b, result);
                    break;
                case "<":
                    break;
                case ">":
                    break;
                case "=":
                    break;
                case "!=":
                    break;
                case "<=":
                    break;
                case ">=":
                    break;
                default:
                    System.err.print("Wrong operator, choose from (+, -, *, /, <, >, =, !=, <=, >=).");
                    break;
            }

            System.out.printf(
                    "Result: %s %s %s = %s\n",
                    a.toString(),
                    operator,
                    b.toString(),
                    result.toString()
            );

            underline();
        }
    }

    private static void underline() {
        System.out.println("========================================");
    }

    private static void printResult(Rational a, String operator, Rational b, Rational result) {

    }
}
