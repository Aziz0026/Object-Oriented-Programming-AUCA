class Turtle {
    //state
    private int x, y;
    private int dx, dy;
    private boolean isPenDown;

    //behavior

    Turtle() {
        //init position for turtle
        x = 0;
        y = 0;

        //init direction for turtle
        dx = 1;
        dy = 0;

        //init of a pen
        isPenDown = false;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void move(int steps, Field field) {
        for (int i = 0; i < steps; i++) {
            int nextX = x + dx;
            int nextY = y + dy;

            if (nextX < 0 || nextY < 0 || nextX > field.getWidth() || nextY > field.getHeight()) {
                break;
            }

            if (isPenDown) {
                field.mark(x, y);
            }

            x = nextX;
            y = nextY;
        }
    }

    void putPenUp() {
        isPenDown = false;
    }

    void putPenDown() {
        isPenDown = true;
    }

    void turnRight() {
        int temp = dx;
        dx = dy;
        dy = temp;

        dx = -dx;
    }

    void turnLeft() {
        int temp = dx;
        dx = dy;
        dy = temp;

        dy = -dy;
    }
}
