public class Main {
    public static void main(String[] args) {
        ArrayListInt array = new ArrayListInt();

        int counter = 0;
        while (counter != 100000000) {
            array.add(counter);
            counter++;

            System.out.println(counter);
        }
    }

    private static void printArray(ArrayListInt array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}
