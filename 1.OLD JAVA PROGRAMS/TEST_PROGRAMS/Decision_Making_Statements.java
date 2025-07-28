package TEST_PROGRAMS;
import java.util.Scanner;
public class Decision_Making_Statements {
    public static void main(String[] args) {
        //Java Program illustrating the use of decision making statemnts
        System.out.println("Decision making Statements");

        //--->if statement
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the valu of a:");
        int a = x.nextInt();
        if(a<20){
            System.out.println("Yes! a is smaller than 20");
        }

        //--->if-else statements
        //takinh i/p from user
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the valu of a:");
        int a = x.nextInt();
        if(a<20){
            System.out.println("a is smaller than 20");
            System.out.println("The valu of s is:"+a);
        }
        else{
            System.out.println("A is not smaller than 20");
        }
        
        //--->Nested if
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the value of a [Must be greater than 100 to 500]:");
        int a = x.nextInt();
        if(a>100 && a<500){
            System.out.println("A value is greater than 100");
                if(a>200 && a<500){
                    System.out.println("A value is also greater than 200");
                        if(a>300 && a<500){
                            System.out.println("A value is also greater than 300");
                                if(a>400 && a<500){
                                    System.out.println("A value is also greater than 400");
                                        if(a>500){
                                            System.err.println("Invalid!");
                                        }
                                }
                        }
                }
        }
        
        //--->If-else-if ladder
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = x.nextInt();
        if(a>10){
            System.out.println("A is greater than 10");
        }
        else if(a>20){
            System.out.println("A is greater than 20");
        }
        else if(a>30){
            System.out.println("A is greater than 30");
        }
        esle{
            System.out.println("Invalid!");
        }
        
        //--->Switch Case
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = x.nextInt();
        switch(a){
        case 5 :  System.out.println("It is 5");
                    break;
        case 10 : System.out.println("It is 10");
                    break;
        case 15 : System.out.println("It is 15");
                    break;
        case 20 : System.out.println("It is 20");
                    break;
        default:  System.out.println("Not present");
        }

    }
}
