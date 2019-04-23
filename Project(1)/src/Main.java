import processing.core.PApplet;

public class Main extends PApplet {
    private Field field;
    private Apple apple;
    private Snake snake;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        field = new Field();
        snake = new Snake(field, 0, 0, 1, 0); //position and direction to move
        apple = new Apple(field, snake);
    }

    public void draw() {
        background(0);

        snake.move();

        if(snake.collides(apple)){
            snake.grow();
            apple = new Apple(field, snake);
        }

        field.draw(this);
        apple.draw(this);
        snake.draw(this);

        delay(100);
    }

    public void keyPressed() {
        switch (keyCode) {
            case UP:
                snake.turnUp();
                break;
            case DOWN:
                snake.turnDown();
                break;
            case RIGHT:
                snake.turnRight();
                break;
            case LEFT:
                snake.turnLeft();
                break;
            default:
                System.err.println("Something went wrong.");
                break;
        }
    }

    public static void main(String... args) {
        PApplet.main("Main");
    }
}