class ArrayListInt {
    private int size;
    private int[] items;

    ArrayListInt() {
        size = 0;
        items = new int[size];
    }

    int size() {
        return size;
    }

    int get(int index) {
        return items[index];
    }

    void set(int index, int value) {
        items[index] = value;
    }

    void remove(int removalIndex) {
        size--;

        int[] newItems = new int[size];

        for (int i = 0, k = 0; i < items.length; i++) {
            if (i != removalIndex) {
                newItems[k++] = items[i];
            }
        }

        items = newItems;
    }

    //Add's element to last index

    void add(int value) {
        size++;

        int[] newItems = new int[size];

        System.arraycopy(items, 0, newItems, 0, items.length);

        newItems[newItems.length - 1] = value;

        items = newItems;
    }

    //TODO create another Add() method that get (int index, int value) and etc...

    void add(int index, int value) {
        int[] newItems = new int[size++];

        System.arraycopy(items, 0, newItems, 0, index);

        newItems[index] = value;

        System.arraycopy(items, index, newItems, index + 1, items.length - index);

        items = newItems;
    }
}
