package USING_BUFFEREDCLASS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Farenheit_to_celsius {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Temparature in Farenheit:");
        int Farenheit = Integer.parseInt(br.readLine());
        int Celsius = (Farenheit-32)*5/9;
        
        System.out.print("Entre the Tempareture in Celsius:");
        int celsius = Integer.parseInt(br.readLine());
        int farenheit = (celsius*9/5)+32;

        System.out.println("Farenheit to celsius:"+Celsius);
        System.out.println("Celsis to Farenheit:"+farenheit);
    }
}
