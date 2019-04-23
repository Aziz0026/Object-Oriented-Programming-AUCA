import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        String[] integers = sc.nextLine().split("\\s");

        for (String integer : integers) {
            numbers.add(Integer.parseInt(integer));
        }

        System.out.println("Before reversing: ");
        printArray(numbers);

        reverseNumbers(numbers);

        System.out.println("After reversing: ");
        printArray(numbers);

        System.out.println("===================");
    }

    private static void printArray(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }

    private static void reverseNumbers(ArrayList<Integer> numbers) {
        for (int i = 0, j = numbers.size() - 1; i < j; i++, j--) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(j));
            numbers.set(j, temp);
        }
    }
}