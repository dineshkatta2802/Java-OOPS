package Constructors;
import java.util.Scanner;
class Progress_card{
    int Number_of_Subjects;

    Progress_card(){
        //Declarin the Scanner Class
        Scanner x = new Scanner(System.in);
        //Entering the credentials
        //Student Name
        System.out.print("Enter the Student Name:");
        String Student_name = x.nextLine();
        //Father Name
        System.out.print("Enter the Students Father Name:");
        String Father_name = x.nextLine();
        //Mother Name
        System.out.print("Enter the Students Mother Name:");
        String Mother_name = x.nextLine();
        //Registration Number
        System.out.print("Enter the Students Registration Number:");
        int Registration_number = x.nextInt();

        //making an Array to enter the Subject names and Marks
        //Enter the values using the Array
        System.out.print("Enter the number of Subjects:");
        //enter the number of subjects that you had in your ciriculum
        Number_of_Subjects = x.nextInt();
        //Declaring ad initialising the arry od Subjects and marks
        String Subjects[] = new String[Number_of_Subjects];
        int Marks[] = new int[Number_of_Subjects];

        for(int i=0 ;i<=Number_of_Subjects;i++){
            System.out.print("Enter Subject names "+i+":");
            Subjects[i] = x.nextLine();
            System.out.println();
        }

        for(int i=0 ;i<=Number_of_Subjects;i++){
            System.out.print("The marks obatines in "+Subjects[i]+" :");
            Marks[i] = x.nextInt();
        }

        //Finding the Totals marks to Obtain Percentage
        int Total = 0;
        for(int i: Marks){
            Total += i;
        }
        System.out.println("Total Marks Obtained:"+Total);


        //Finding the percentage of each subject
        for(int i=0; i<=Number_of_Subjects;i++){
            System.out.print("We Know that the Total mark For each subject is 100");
            System.out.println("Lets find percentage of "+Subjects[i]);
            int percentage = (Marks[i]/100)*100;
            System.out.println(Subjects[i]+" %="+percentage); 
            
        if(percentage<=50){
            System.out.println("FAIL");
        }
        else{
            System.out.println("PASS");
        }
        }

        if(((Total/Number_of_Subjects*100)*100)<=50){
            System.out.println("FAIL");
        }
        else{
            System.out.println("PASS");
        }
    }


}
public class Report_card {
    public static void main(String[] args) {
        Progress_card Raju = new Progress_card();
    }
}
