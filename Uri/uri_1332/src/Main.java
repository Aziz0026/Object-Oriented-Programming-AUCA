import java.util.Scanner;

//TODO make this programme more secure, fool protection

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int times = sc.nextInt();

        for (int i = 0; i < times; i++) {
            String givenWord = sc.next();

            char[] word = givenWord.toCharArray();

            if (givenWord.length() == 3) {
                if (word[0] == 't' && word[2] == 'o' || word[1] == 'w' && word[2] == 'o' || word[0] == 't' && word[1] == 'w') {
                    System.out.println(2);
                } else {
                    System.out.println(1);
                }
            } else {
                System.out.println(3);
            }
        }
    }
}
