import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int times = Integer.parseInt(reader.readLine());

        for (int i = 0; i < times; i++) {
            String[] givenLine = reader.readLine().split("\\s");

            String rajesh = givenLine[0];
            String sheldon = givenLine[1];

            if (givenLine[0].equals(givenLine[1])) {
                System.out.println("empate");
            } else {
                switch (rajesh) {
                    case "tesoura":
                        if (sheldon.equals("papel") || sheldon.equals("lagarto")) {
                            rajesh();
                        } else if (sheldon.equals("pedra") || sheldon.equals("spock")) {
                            sheldon();
                        }
                        break;
                    case "pedra":
                        if (sheldon.equals("lagarto") || sheldon.equals("tesoura")) {
                            rajesh();
                        } else if (sheldon.equals("spock") || sheldon.equals("papel")) {
                            sheldon();
                        }
                        break;
                    case "papel":
                        if (sheldon.equals("pedra") || sheldon.equals("spock")) {
                            rajesh();
                        } else if (sheldon.equals("tesoura") || sheldon.equals("lagarto")) {
                            sheldon();
                        }
                        break;
                    case "lagarto":
                        if (sheldon.equals("spock") || sheldon.equals("papel")) {
                            rajesh();
                        } else if (sheldon.equals("pedra") || sheldon.equals("tesoura")) {
                            sheldon();
                        }
                        break;
                    case "spock":
                        if (sheldon.equals("tesoura") || sheldon.equals("pedra")) {
                            rajesh();
                        } else if (sheldon.equals("lagarto") || sheldon.equals("papel")) {
                            sheldon();
                        }
                        break;
                    default:
                        System.err.println("Something went wrong.");
                        break;
                }
            }
        }
    }

    private static void sheldon() {
        System.out.println("sheldon");
    }

    private static void rajesh() {
        System.out.println("rajesh");
    }
}