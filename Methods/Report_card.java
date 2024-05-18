package Methods;
import java.io.IOException;
import java.util.Scanner;

class Students_data {
    Scanner x = new Scanner(System.in);
    //These instance variables for Default Constructor and Methods and Parameterised Constructor
    String Student_name;
    String Father_name;
    String Mother_name;
    int Reg_number;

    //get_data instance variables and arrays
    int NOS;
    String[] Subjects;
    int[] Marks;
    int[] STM;
    double[] POES;
    double[] SP;
    int TM;
    int TOSTM;
    double OAP;

    //Default Constructor
    // Students_data(){
    //     Student_name = "Dinesh";
    //     Father_name = "Jayaraj";
    //     Mother_name = "Kavitha";
    //     Reg_number = 24102;
    // }

    //Parameterized Constructor
    Students_data(String SN,String FN,String MN,int RN){
        Student_name = SN;
        Father_name = FN;
        Mother_name = MN;
        Reg_number = RN;
    }

    void get_data() {
//-----------------------------------------------------------------------------------------------------------------------
        // Entering the Students Credentials                                //-----|
        // System.out.print("Enter Student Name: ");                        //     |
        // Student_name = x.nextLine();                                     //     |
        // System.out.print("Enter the Father's Name: ");                   //     |
        // System.out.print("Enter the Mother's Name: ");                   //     |--->This part of code only has methods 
        // Father_name = x.nextLine();                                      //     |
        // System.out.print("Enter the Mother's Name: ");                   //     |
        // Mother_name = x.nextLine();                                      //     |
        // System.out.print("Enter the Student Registration Number: ");     //     |
        // Reg_number = x.nextInt();                                        //-----|
//----------------------------------------------------------------------------------------------------------------------
        System.out.println("Students name:"+Student_name);      //-----|
        System.out.println("Father's name:"+Father_name);       //     |--->This part of the code is used to display
        System.out.println("Mother's name:"+Mother_name);       //     |--->the SN,FN,MN,RN in Terminal
        System.out.println("Registration Number:"+Reg_number);  //-----|


        System.out.print("Enter the number of Subjects: ");
        NOS = x.nextInt();

        x.nextLine(); // Consume newline

        Subjects = new String[NOS];
        Marks = new int[NOS];
        STM = new int[NOS];
        SP = new double[NOS];
        POES = new double[NOS];

        System.out.println("Enter each Subjects name:");
        for (int i = 0; i < NOS; i++) {
            System.out.print((i + 1) + ": ");
            Subjects[i] = x.nextLine();
        }

        System.out.println("Enter the Marks obtained in Each Subjects:");
        for (int i = 0; i < NOS; i++) {
            System.out.print((i + 1) + ". " + Subjects[i] + " : ");
            Marks[i] = x.nextInt();
        }
    }

    // Entering total marks for each subject
    void ESD_IN() {
        for (int i = 0; i < NOS; i++) {
            System.out.print("Enter the Total marks for " + Subjects[i] + ": ");
            STM[i] = x.nextInt();
        }
    }

    // Calculating the percentage of each Subjects
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
            System.out.format(format, Subjects[i], Marks[i], STM[i], POES[i]);
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
        //Using Only methods and Default Constructor
        // Students_data PC1 = new Students_data();

        //Parameterised Constructor
        Students_data PC1 = new Students_data("Dinesh","Jayaraj","Kavitha",24102);
        PC1.get_data();
        PC1.ESD_IN();
        PC1.ESP(); // Calculate the percentage for each subject
        PC1.ESD_OUT();
        PC1.OP();
    }
}
