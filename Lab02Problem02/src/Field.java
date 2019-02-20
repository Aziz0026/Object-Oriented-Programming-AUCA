class Field {
    //state

    final static int WIDTH = 20;
    final static int HEIGHT = 20;

    private final static char MARKED_CELL = '*';
    private final static char EMPTY_CELL = '.';
    private final static char TURTLE_CELL = 'T';

    private char[][] data;

    //behavior

    Field(int width, int height) {
        data = new char[width][height];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                data[y][x] = EMPTY_CELL;
            }
        }
    }

    //getters

    int getWidth() {
        return data[0].length;
    }

    int getHeight() {
        return data.length;
    }

    void print(Turtle turtle) {
        System.out.println();
        for (int y = 0; y < data.length; y++) {
            for (int x = 0; x < data[0].length; x++) {
                if (turtle.getX() == y && turtle.getY() == x) {
                    System.out.print(TURTLE_CELL);
                } else {
                    System.out.print(data[y][x]);
                }
            }
            System.out.println();
        }
    }

    void mark(int x, int y) {
        data[y][x] = Field.MARKED_CELL;
    }
}