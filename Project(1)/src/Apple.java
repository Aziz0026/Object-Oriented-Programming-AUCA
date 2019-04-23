import processing.core.PApplet;

class Apple {
    private final static int COLOR = 0xffff694f;

    private Field field;
    private int x, y;

    Apple(Field field, Snake snake) {
        this.field = field;

        do {
            x = (int) (Math.random() * field.getWidth());
            y = (int) (Math.random() * field.getHeight());
        } while (snake.collides(x, y));
    }


    void draw(PApplet applet) {
        float cellSize = field.getCellSize(applet);
        float screenX = field.getScreenX(applet, x);
        float screenY = field.getScreenY(applet, y);

        applet.fill(COLOR);
        applet.rect(screenX, screenY, cellSize, cellSize);
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }
}
