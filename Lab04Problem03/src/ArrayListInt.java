class ArrayListInt {
    private int size = 0;
    private int[] list;

    ArrayListInt() {
        list = new int[size];
    }

    int size() {
        return list.length;
    }

    int get(int index) {
        try {
            return list[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.printf("This array doesn't have element with index: %d.\n", index);
        }

        return 0;
    }

    void set(int index, int value) {
        try {
            list[index] = value;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.printf("This array doesn't have element with index: %d.\n", index);
        }
    }

    void remove(int index) {
        try{
            size--;

            int[] array = new int[size];

            for (int i = 0, k = 0; i < list.length; i++) {
                if (i == index) {
                    continue;
                }
                array[k++] = list[i];
            }

            list = array;
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.printf("This array doesn't have element with index: %d.\n", index);
        }
    }

    //Add's element to last index

    void add(int v) {
        size++;

        int[] array = new int[size];

        System.arraycopy(list, 0, array, 0, list.length);

        array[array.length - 1] = v;

        this.list = array;
    }

    //TODO create another Add() method that get (int index, int value) and etc...

    void add(int i, int v) {
        //TODO
    }
}
