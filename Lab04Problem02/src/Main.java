import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s");

        insertZeroBeforeEvenNumbers(arrayList, input);

        System.out.println("After insertion: ");
        printArray(arrayList);

        removeOddNumbers(arrayList);

        System.out.println("After deletion: ");
        printArray(arrayList);
    }

    private static void removeOddNumbers(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 != 0) {
                arrayList.remove(i);
            }
        }
    }

    private static void insertZeroBeforeEvenNumbers(ArrayList<Integer> arrayList, String[] input) {
        for (String element : input) {
            int number = Integer.valueOf(element);

            if (number % 2 == 0) {
                arrayList.add(0);
            }
            arrayList.add(number);
        }
    }

    private static void printArray(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
