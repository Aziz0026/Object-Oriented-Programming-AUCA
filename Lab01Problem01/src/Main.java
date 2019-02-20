import java.util.Scanner;

public class Main {
    // Turtle Data

    private final static char TURTLE = 'T';
    private final static char MARKED_CELL = '*';
    private static int turtleX, turtleY;
    private static int dx, dy;

    private static boolean isPenDown;

    //Field data

    private final static int WIDTH = 20;
    private final static int HEIGHT = 20;
    private final static char EMPTY_CELL = '.';

    private static char[][] field;

    private static void initField() {
        field = new char[WIDTH][HEIGHT];

        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                field[y][x] = EMPTY_CELL;
            }
        }
    }

    private static void printField() {
        System.out.println();
        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 20; x++) {
                if (turtleY == y && turtleX == x) {
                    System.out.print(TURTLE);
                } else {
                    System.out.print(field[y][x]);
                }
            }
            System.out.println();
        }
    }

    private static void initTurtle() {
        //init position for turtle
        turtleX = 0;
        turtleY = 0;

        //init direction for turtle
        dx = 1;
        dy = 0;

        //init of a pen
        isPenDown = false;
    }

    private static void move(int steps) {
        for (int i = 0; i < steps; i++) {
            int nextX = turtleX + dx;
            int nextY = turtleY + dy;


            //TODO: make some constants
            if (nextX < 0 || nextY < 0 || nextX >= WIDTH || nextY >= HEIGHT) {
                break;
            }

            if (isPenDown) {
                field[turtleY][turtleX] = MARKED_CELL;
            }

            turtleX = nextX;
            turtleY = nextY;
        }
    }

    private static void putPenUp() {
        isPenDown = false;
    }

    private static void putPenDown() {
        isPenDown = true;
    }

    private static void turnRight() {
        int temp = dx;
        dx = dy;
        dy = temp;

        dx = -dx;
    }

    private static void turnLeft() {
        int temp = dx;
        dx = dy;
        dy = temp;

        dy = -dy;
    }

    public static void main(String[] args) {
        initTurtle();
        initField();

        Scanner sc = new Scanner(System.in);
        String line;

        boolean working = true;

        do {
            line = sc.nextLine();
            String[] parts = line.split(" ");
            String command = parts[0].toLowerCase();

            switch (command) {
                case "move":
                    if (parts.length >= 2) {
                        int steps = Integer.parseInt(parts[1]);
                        move(steps);
                    } else {
                        System.err.println("Please, specify the number of steps.");
                    }
                    break;
                case "penup":
                    putPenUp();
                    break;
                case "pendown":
                    putPenDown();
                    break;
                case "turnright":
                    turnRight();
                    break;
                case "turnleft":
                    turnLeft();
                    break;
                case "print":
                    printField();
                    break;
                case "exit":
                    working = false;
                    break;
                default:
                    System.err.println("Invalid command, please try again.");
                    break;
            }
        } while (working);
    }
}