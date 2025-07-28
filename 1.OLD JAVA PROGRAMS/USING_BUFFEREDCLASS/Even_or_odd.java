package USING_BUFFEREDCLASS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Even_or_odd {
    public static void main(String[] args)throws IOException{
        System.out.print("Entre the number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());

        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
