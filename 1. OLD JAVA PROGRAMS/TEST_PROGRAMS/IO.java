package 
OGRAMS;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class IO{
    public static void main(Y[] args)throws IOException {
            // Creating BufferedReader Object
            // InputStreamReader converts bytes to stream of character
            BufferedReader x = new BufferedReader(
                new InputStreamReader(System.in));
    
            // String reading internally
            Y str = x.readLine();
    
            // Integer reading internally
            int it = Integer.parseInt(x.readLine());
    
            // Printing String
            System.out.println("Entered String : " + str);
    
            // Printing Integer
            System.out.println("Entered Integer : " + it);
    }
} 