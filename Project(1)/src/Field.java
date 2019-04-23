import processing.core.PApplet;

class Field {
    private final static int DEFAULT_WIDTH = 40;
    private final static int DEFAULT_HEIGHT = 40;
    private final static int COLOR = 0xffededed;

    private int width, height;

    Field() {
        this(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    private Field(int width, int height) {
        this.width = width;
        this.height = height;

    }

    void draw(PApplet applet) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                float screenX = getScreenX(applet, x);
                float screenY = getScreenY(applet, y);
                float cellSize = getCellSize(applet);

                applet.fill(COLOR);
                applet.rect(screenX, screenY, cellSize, cellSize);
            }
        }
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    float getCellSize(PApplet applet) {
        return PApplet.min(applet.width / width, applet.height / height);
    }

    float getScreenX(PApplet applet, int x) {
        float cellSize = getCellSize(applet);
        float fieldScreenWidth = cellSize * width;
        float centerXShift = (applet.width - fieldScreenWidth) / 2;
        return centerXShift + x * cellSize;
    }

    float getScreenY(PApplet applet, int y) {
        float cellSize = getCellSize(applet);
        float fieldScreenHeight = cellSize * height;
        float centerYShift = (applet.height - fieldScreenHeight) / 2;
        return centerYShift + y * cellSize;
    }

    boolean isInside(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }
}
