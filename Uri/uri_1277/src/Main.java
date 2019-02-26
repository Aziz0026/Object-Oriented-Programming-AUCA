import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int times = Integer.parseInt(reader.readLine().trim());

        String[][] result = new String[4][];

        for (int i = 0; i < times; i++) {
            int numberOfStudents = Integer.parseInt(reader.readLine());

            String[] absentStudents = new String[numberOfStudents];

            String[] nameOfStudents = reader.readLine().trim().split("\\s");
            String[] attendance = reader.readLine().trim().split("\\s");

            for (int j = 0; j < attendance.length; j++) {
                char[] attendanceLetters = attendance[j].toCharArray();

                int present = 0, absent = 0;

                for (char attendanceLetter : attendanceLetters) {
                    if (attendanceLetter == 'P') {
                        present++;
                    } else if (attendanceLetter == 'A') {
                        absent++;
                    }
                }

                if (((100 / (present + absent)) * present) < 75) {
                    absentStudents[j] = nameOfStudents[j];
                }

                result[i] = absentStudents;
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (String element : result[i]) {
                if (element != null) {
                    System.out.print(element + " ");
                }
            }

            if (i != result.length - 1) {
                System.out.println();
            }
        }
    }
}
