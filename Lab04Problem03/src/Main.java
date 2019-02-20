public class Main {
    public static void main(String[] args) {
        ArrayListInt array = new ArrayListInt();

        array.add(8);
        array.add(2);
        array.add(3);
        array.add(7);
        array.add(3);

        printArray(array);
        System.out.println();

        array.remove(3);
        array.remove(2);

        printArray(array);
        System.out.println();

    }

    private static void printArray(ArrayListInt array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}
