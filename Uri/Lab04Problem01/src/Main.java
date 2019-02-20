import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String[] integers = sc.nextLine().split("\\s");

        for (String integer : integers) {
            numbers.add(Integer.parseInt(integer));
        }

        System.out.println("Before reversing: ");
        System.out.println(returnStringFromArray(numbers));

        Collections.reverse(numbers);

        System.out.println("After reversing: ");
        System.out.println(returnStringFromArray(numbers));
    }

    private static StringBuilder returnStringFromArray(ArrayList<Integer> numbers) {
        StringBuilder s = new StringBuilder();

        for (int number : numbers) {
            s.append(number).append(" ");
        }

        return s;
    }
}