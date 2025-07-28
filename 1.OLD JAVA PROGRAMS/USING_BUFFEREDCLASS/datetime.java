package USING_BUFFEREDCLASS;

/**
 * date-time
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        
        // Define a format for date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        // Format the date and time using the defined format
        String formattedDateTime = now.format(formatter);
        
        // Display the formatted date and time
        System.out.println("Current Date and Time: " + formattedDateTime);
    }
    }
