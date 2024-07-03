package Exception_Handling.Checked_Exceptions;

import java.util.Scanner;

public class IOException {
    public static void main(String[] args) {
        // Java program to demonstrate IOException

		// Create a new scanner with the specified String 
		// Object 
		Scanner scan = new Scanner("Hello Geek!"); 

		// Print the line 
		System.out.println("" + scan.nextLine()); 

		// Check if there is an IO exception 
		System.out.println("Exception Output: "
						+ scan.ioException()); 

		scan.close();

    }
}
