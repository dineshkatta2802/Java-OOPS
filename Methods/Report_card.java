package Methods;
import java.io.IOException;
import java.util.Scanner;

class Students_data {
    Scanner x = new Scanner(System.in);
    String Student_name;
    String Father_name;
    String Mother_name;
    int Reg_number;
    int NOS;
    String[] Subject;
    int[] Marks;
    int[] STM;
    double[] POES;
    double[] SP;
    int TM;
    int TOSTM;
    double OAP;

    void get_data() {
        // Entering the Students Credentials
        System.out.print("Enter Student Name: ");
        Student_name = x.nextLine();

        System.out.print("Enter the Father's Name: ");
        Father_name = x.nextLine();

        System.out.print("Enter the Mother's Name: ");
        Mother_name = x.nextLine();

        System.out.print("Enter the Student Registration Number: ");
        Reg_number = x.nextInt();

        System.out.print("Enter the number of Subjects: ");
        NOS = x.nextInt();

        x.nextLine(); // Consume newline

        Subject = new String[NOS];
        Marks = new int[NOS];
        STM = new int[NOS];
        SP = new double[NOS];
        POES = new double[NOS];

        System.out.println("Enter each Subject name:");
        for (int i = 0; i < NOS; i++) {
            System.out.print((i + 1) + ": ");
            Subject[i] = x.nextLine();
        }

        System.out.println("Enter the Marks obtained in Each Subject:");
        for (int i = 0; i < NOS; i++) {
            System.out.print((i + 1) + ". " + Subject[i] + " : ");
            Marks[i] = x.nextInt();
        }
    }

    // Entering total marks for each subject
    void ESD_IN() {
        for (int i = 0; i < NOS; i++) {
            System.out.print("Enter the Total marks for " + Subject[i] + ": ");
            STM[i] = x.nextInt();
        }
    }

    // Calculating the percentage of each Subject
    void ESP() {
        for (int i = 0; i < NOS; i++) {
            POES[i] = ((double) Marks[i] / STM[i]) * 100;
        }
    }

    // Showing the entered data in tabular form with borders
    void ESD_OUT() {
        String format = "| %-15s | %-10d | %-12d | %-10.2f |%n";
        System.out.format("+-----------------+------------+--------------+------------+%n");
        System.out.format("| Subjects        | Marks      | Total Marks  | Percentage |%n");
        System.out.format("+-----------------+------------+--------------+------------+%n");
        for (int i = 0; i < NOS; i++) {
            System.out.format(format, Subject[i], Marks[i], STM[i], POES[i]);
        }
        System.out.format("+-----------------+------------+--------------+------------+%n");
    }

    // Calculating and displaying overall percentage and grade
    void OP() {
        for (int i = 0; i < NOS; i++) {
            TM += Marks[i];
        }

        for (int i = 0; i < NOS; i++) {
            TOSTM += STM[i];
        }

        OAP = ((double) TM / TOSTM) * 100;
        System.out.println("The Total Percentage Obtained: " + OAP + "%");

        if (OAP >= 90 && OAP <= 100) {
            System.out.println("A Grade");
        } else if (OAP >= 80 && OAP < 90) {
            System.out.println("B Grade");
        } else if (OAP >= 70 && OAP < 80) {
            System.out.println("C Grade");
        } else if (OAP >= 60 && OAP < 70) {
            System.out.println("D Grade");
        } else if (OAP >= 50 && OAP < 60) {
            System.out.println("E Grade");
        } else {
            System.out.println("FAIL");
        }
    }
}

public class Report_card {
    public static void main(String[] args) throws IOException {
        Students_data PC1 = new Students_data();
        PC1.get_data();
        PC1.ESD_IN();
        PC1.ESP(); // Calculate the percentage for each subject
        PC1.ESD_OUT();
        PC1.OP();
    }
}
