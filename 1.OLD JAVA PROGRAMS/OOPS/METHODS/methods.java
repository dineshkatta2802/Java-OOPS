package OOPS;

import java.util.Scanner;
class percentage{
    int P=0;
    public  int Total_Percentage(int a,int b){
        int P=(a/b);
        return P;
    }
}

public class methods {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Number of Subjects:");
        int size = x.nextInt();
        //size of marks array
        int arr[] = new int[size];
        //size of the subject array
        String arr1String[] = new String[size];
        //Entering the subject names alpabetically
        System.out.println("--->Enter the Subject names alphabetically!");
        for(int i=0;i<size;i++){
            System.out.print("Subject"+(i+1)+":");
            arr1String[i]=x.next();
        }
        System.out.println("--->Now enter the marks that you have obtained in each of the Subject out of 100:");
        for(int i=0;i<size;i++){
            System.out.print((i+1)+"."+arr1String[i]+" "+":");
            arr[i]=x.nextInt();
        }
        //Adding the total marks obtained
        int Total=0;
        System.out.println("--->Now lets add the obatined marks!");
        for(int i=0;i<size;i++){
            Total +=arr[i];
        }
        System.out.println("--->Total="+Total);

        percentage C = new percentage();
        float T = C.Total_Percentage(Total, size);


        if(Total>175){
        System.out.println("--->Congrats your total obtained percentage is:"+T);
        //to obtain the each subject percentage and grade
        System.out.print("--->Enter 1-Yes or 0-No to see the Grades of each subject:");
        int YN = x.nextInt();
            if (YN==1) {
                System.out.println("--->Grade of each subject is as follows:");
                for(int i=0;i<size;i++){
                    System.out.print(arr1String[i]+":");{
                        if(arr[i]<=100 && arr[i]>=90){
                            System.out.println("A");
                        }
                        else if(arr[i]<=90 && arr[i]>=80){
                            System.out.println("B");
                        }
                        else if(arr[i]<=80 && arr[i]>=70){
                            System.out.println("C");
                        }
                        else if(arr[i]<=70 && arr[i]>=60){
                            System.out.println("D");
                        }
                        else if(arr[i]<=60 && arr[i]>=50){
                            System.out.println("E");
                        }
                        else if(arr[i]<=50 && arr[i]>=0){
                            System.out.println("FAIL");
                    }
                    }
                }
            }
            else{
                System.out.println("Have a Wonderfull Day!");
            }
        }
        else{
            System.out.println("FAIL");
        }

        
    }
}
