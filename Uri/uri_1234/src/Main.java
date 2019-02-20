import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()){
            String sentence = sc.nextLine();

            char[] aSentence = sentence.toCharArray();

            for (int i = 0; i < aSentence.length; i++) {
                if (i % 2 == 0) {
                    System.out.print(Character.toUpperCase(aSentence[i]));
                }else{
                    System.out.print(Character.toLowerCase(aSentence[i]));
                }
            }

            System.out.println();
        }
    }
}
