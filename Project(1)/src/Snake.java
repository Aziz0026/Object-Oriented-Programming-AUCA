import processing.core.PApplet;

import java.awt.*;
import java.util.ArrayList;

class Snake {
    private final static int COLOR = 0xffff0000;
    private final static int COLOR_DEAD = 0xffffcfc6;
    private ArrayList<Point> body;
    private int head;
    private int dx, dy;
    private boolean dead;

    private Field field;

    Snake(Field field, int x, int y, int dx, int dy) {
        this.field = field;
        this.dx = dx;
        this.dy = dy;

        body = new ArrayList<>();
        body.add(new Point(x, y));
        head = 0;

        this.dead = false;
    }

    private int getX() {
        return body.get(head).x;
    }

    private int getY() {
        return body.get(head).y;
    }

    private void setX(int x) {
        body.get(head).x = x;
    }

    private void setY(int y) {
        body.get(head).y = y;
    }

    boolean collides(int x, int y) {
        return getX() == x && getY() == y;
    }


    boolean collides(Apple apple) {
        return collides(apple.getX(), apple.getY());
    }

    void move() {
        if (dead) return;

        int nextX = getX() + dx;
        int nextY = getY() + dy;

        head = (head + 1) % body.size();

        if (!field.isInside(nextX, nextY)) {
            dead = true;
        } else {
            setX(nextX);
            setY(nextY);
        }
    }


    void turnUp() {
        if (dy != 1) {
            dx = 0;
            dy = -1;
        }
    }

    void turnLeft() {
        if (dx != 1) {
            dx = -1;
            dy = 0;
        }
    }

    void turnRight() {
        if (dx != -1) {
            dx = 1;
            dy = 0;
        }
    }

    void turnDown() {
        if (dy != -1) {
            dx = 0;
            dy = 1;
        }
    }

    void draw(PApplet applet) {
        float cellSize = field.getCellSize(applet);

        for(Point bodyPart : body){
            float screenX = field.getScreenX(applet, bodyPart.x);
            float screenY = field.getScreenY(applet, bodyPart.y);

            applet.fill(dead ? COLOR_DEAD : COLOR);
            applet.rect(screenX, screenY, cellSize, cellSize);
        }
    }

    void grow() {
        body.add(head + 1, new Point(getX(), getY()));
        move();
    }
}