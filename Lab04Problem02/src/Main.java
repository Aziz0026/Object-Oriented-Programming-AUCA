import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s");

        for (String element : input) {
            int number = Integer.valueOf(element);

            if (number % 2 == 0) {
                arrayList.add(0);
            }

            arrayList.add(number);
        }

        underline();
        System.out.println("After insertion: ");
        System.out.println(returnStringFromArray(arrayList));


        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 != 0) {
                arrayList.remove(i);
            }
        }

        underline();
        System.out.println("After deletion: ");
        System.out.println(returnStringFromArray(arrayList));
    }

    private static void underline() {
        System.out.println("==============================");
    }

    private static StringBuilder returnStringFromArray(ArrayList<Integer> numbers) {
        StringBuilder s = new StringBuilder();

        for (int number : numbers) {
            s.append(number).append(" ");
        }

        return s;
    }
}
