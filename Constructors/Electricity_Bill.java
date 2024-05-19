package Constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class E_Bill{
    Scanner x = new Scanner(System.in);

    //Date and Time Instance Variables
    String Starting_Date;
    String Ending_Date;

    //get_data method instance varables
    int Previous_readings;
    int Current_reading;

    //Calculations method instance variables
    int Units;
    String DOC;
    int Wattage_Amt;
    int FC=100;
    int GST=216;
    int Total;

    //display method instance variables
    String Email = "support@city.com";
    String Customer_No = "1800-123-456";


    //Constructor Instance Variables
    String Name;          //----
    String Address;       //    |
    int User_Number;      //    |
    int Aadhar_Number;    //    |--->⁡⁣⁣⁢These are the Permanent data that cannot be changed⁡
    int Mobile_Number;    //    |
    String District;      //    |
    int  Meter_Number;    //----

    //Constructor to enter the Permanent data
    E_Bill(String name, String add, int UN, int AN, int MBN,String Dis, int MN){
        Name = name;
        Address = add;
        User_Number = UN;
        Aadhar_Number = AN;
        Mobile_Number = MBN;
        District = Dis;
        Meter_Number = MN;
    }

    void Billing_Period(){
        System.out.print("Enter the Starting Date:");
        Starting_Date = x.nextLine();

        System.out.print("Enter the Ending Date:");
        Ending_Date = x.nextLine();

        LocalDate startDate = LocalDate.parse(Starting_Date, DateTimeFormatter.ISO_DATE);
        LocalDate endDate = LocalDate.parse(Ending_Date, DateTimeFormatter.ISO_DATE);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Number of days between " + startDate + " and " + endDate + " is: " + daysBetween);
    }

    void get_data(){
        System.out.print("Enter the Previous readings(kWh):");
        Previous_readings = x.nextInt();

        System.out.print("Enter the Current reading(kWh):");
        Current_reading = x.nextInt();
    }


    void Calculations(){
        Units = Current_reading - Previous_readings;
    
        // Consume the newline character left in the buffer
        x.nextLine();
    
        //Checking whether the Appliance is Domestic or Commercial
        System.out.print("Enter the Appliance type (Domestic/D or Commercial/C):");
        DOC = x.nextLine();
    
        if(DOC.equals("Domestic") || DOC.equals("D") || DOC.equals("d")){
            if(Units <= 100){
                Wattage_Amt = 100 * 5;
                System.out.println("The Wattage Amount: " + Wattage_Amt + "/-");
            }
            else if(Units > 100){
                Wattage_Amt = 100 * 5 + (Units - 100) * 7;
                System.out.println("The Wattage Amount: " + Wattage_Amt + "/-");
            }
        }
        else if(DOC.equals("Commercial") || DOC.equals("C") || DOC.equals("c")){
            if(Units <= 100){
                Wattage_Amt = 100 * 10;
                System.out.println("The Wattage Amount: " + Wattage_Amt + "/-");
            }
            else if(Units > 100){
                Wattage_Amt = 100 * 10 + (Units - 100) * 15;
                System.out.println("The Wattage Amount: " + Wattage_Amt + "/-");
            }
        }
    
        //Calculating the total Amount
        System.out.println("Variable Charges: " + Wattage_Amt + "/-");
        System.out.println("Fixed Charge: " + FC + "/-");
        System.out.println("Taxes: " + GST + "/-");
        Total = FC + GST + Wattage_Amt;
        System.out.println("Total: " + Total + "/-");
    }
    

    void display(){
        String format = "|%-20s|%-20s|%n";
        // System.out.format("+--------------------+-------------------+%n");
        // System.out.format("|Name                |%20s|%n", Name);
        // System.out.format("+--------------------+-------------------+%n");
        // System.out.format("|Aadhar Number       |%20d|%n", Aadhar_Number);
        // System.out.format("+--------------------+-------------------+%n");
        // System.out.format("|User Number         |%20d|%n", User_Number);
        // System.out.format("+--------------------+-------------------+%n");
        // System.out.format("|Mobile Number       |%20d|%n", Mobile_Number);
        // System.out.format("+--------------------+-------------------+%n");
        // System.out.format("|District            |%20s|%n", District);
        // System.out.format("+--------------------+-------------------+%n");
        // System.out.format("|Meter Number        |%20d|%n", Meter_Number);
        // System.out.format("+--------------------+-------------------+%n");
        // System.out.format("|Staring Date        |%20s|%n", Starting_Date);
        // System.out.format("+--------------------+-------------------+%n");
        // System.out.format("|Ending Date         |%20s|%n", Ending_Date);
        // System.out.format("+--------------------+-------------------+%n");
        // System.out.format("|Units               |%20d|%n", Units);
        // System.out.format("+--------------------+-------------------+%n");
        // System.out.format("|Type(D|C)           |%20s|%n", DOC);
        // System.out.format("+--------------------+-------------------+%n");
        // System.out.format("|Consumed Current    |%20d|%n", Wattage_Amt);
        // System.out.format("+--------------------+-------------------+%n");
        // System.out.format("|Fixed Charge        |%20d|%n", FC);
        // System.out.format("+--------------------+-------------------+%n");
        // System.out.format("|Taxes               |%20d|%n", GST);
        // System.out.format("+--------------------+-------------------+%n");
        // System.out.format("|Total               |%20d|%n", Total);
        // System.out.format("+--------------------+-------------------+%n");
        // System.out.format("|Email               |%20s|%n", Email);
        // System.out.format("+--------------------+-------------------+%n");
        // System.out.format("|Customer Number     |%20s|%n", Customer_No);
        // System.out.format("+--------------------+-------------------+%n");
        System.out.format("+--------------------+-------------------+%n");
        System.out.format("|Name                |%20s|%n", Name);
        System.out.format("|Aadhar Number       |%20d|%n", Aadhar_Number);
        System.out.format("|User Number         |%20d|%n", User_Number);
        System.out.format("|Mobile Number       |%20d|%n", Mobile_Number);
        System.out.format("|District            |%20s|%n", District);
        System.out.format("|Meter Number        |%20d|%n", Meter_Number);
        System.out.format("|Staring Date        |%20s|%n", Starting_Date);
        System.out.format("|Ending Date         |%20s|%n", Ending_Date);
        System.out.format("|Units               |%20d|%n", Units);
        System.out.format("|Type(D|C)           |%20s|%n", DOC);
        System.out.format("|Consumed Current    |%20d|%n", Wattage_Amt);
        System.out.format("|Fixed Charge        |%20d|%n", FC);
        System.out.format("|Taxes               |%20d|%n", GST);
        System.out.format("|Total               |%20d|%n", Total);
        System.out.format("|Email               |%20s|%n", Email);
        System.out.format("|Customer Number     |%20s|%n", Customer_No);
        System.out.format("+--------------------+-------------------+%n");
    }
    
}
public class Electricity_Bill {
    public static void main(String[] args) {
        E_Bill House1 = new E_Bill("Jayaraj", "NARL Quaters,\nSVU Campus,\nPrakasham Nagar,\nQuater No. C-5,\nTirupati,\n517502", 917774812, 917745008, 967685776, "Balaji", 123456789);
        House1.Billing_Period();
        House1.get_data();
        House1.Calculations();
        House1.display();
    }
}
