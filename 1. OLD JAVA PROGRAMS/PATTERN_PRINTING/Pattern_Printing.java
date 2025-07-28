import java.util.Scanner;
public class Pattern_Printing {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the nuber of rows:");
        int a = x.nextInt();
        System.out.println();

        //--->Right-Triangle
        //star Pattern
        // *            
        // **
        // ***
        // ****
        // *****
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");//must not use println!!!
            }
            System.out.println();
        } 

        //Digits(Single row same digit)
        // 1
        // 22
        // 333
        // 4444
        // 55555
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(""+i);//must not use println!!!
            }
            System.out.println();
        }

        //Digits(Single row consecutive numbers)
        // 1
        // 23
        // 456
        // 78910
        // 1112131415
        int num = 1;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(""+num);//must not use println!!!
                num++;
            }
            System.out.println();
        }

        //Cahracters(Alphabet)
        // A
        // BC
        // DEF
        // GHIJ
        // KLMNO
        char ch='A';
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(""+ch);//must not use println!!!
                ch++;
            }
            System.out.println();
        }
        System.out.println();
        //Reverse digits(Single row same digits)
        // 5
        // 44
        // 333
        // 2222
        // 11111
        for(int i=1,p=5;i<=a;i++,p--){
            for(int j=1;j<=i;j++){
                System.out.print(""+p);//must not use println!!!
            }
            System.out.println();
        }
        
        //Mirror-Triangle
        //Star Pattern
        //       *
        //      **
        //     ***
        //    ****
        //   *****
        for(int i=1;i<a;i++){
            for(int j=2*(a-i);j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //Digits(Single row same digit)
        //      1
        //     22
        //    333
        //   4444        //  55555
        for(int i=1;i<a;i++){
            for(int j=2*(a-i);j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+i);
            }
            System.out.println();
        }
        System.out.println();
        //Character(Alphabet)
        //      A
        //     BC
        //    DEF
        //   GHIJ
        //  KLMNO
        char z = 'A';
        for(int i=1;i<a;i++){
            for(int j=2*(a-i);j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+z);
                z++;
            }
            System.out.println();
        }
        System.out.println();
        //Digits(Single row consecutive numbers)
        //        1
        //       23
        //      456
        //     78910
        //1112131415
        int n=1;
        for(int i=1;i<a;i++){
            for(int j=2*(a-i);j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+n);
                n++;
            }
            System.out.println();
        }
        System.out.println();
    //Digits(Single row reversed digits)
    //           5
    //         4 4
    //       3 3 3
    //     2 2 2 2
    //   1 1 1 1 1
        for(int i=1,p=5;i<a;i++,p--){
            for(int j=2*(a-i);j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+p);
            }
            System.out.println();
        }
        System.out.println();
        //--->Full pyramid
    //     *
    //    * *
    //   * * *
    //  * * * *
    // * * * * *
        for(int i=0;i<a;i++){
            for(int j=a-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //Full Pyramid(Alphabet)
    //        A
    //       B C
    //      D E F
    //     G H I J
    //    K L M N O
        char T='A';
        for(int i=0;i<a;i++){
            for(int j=a-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" "+T);
                T++;
            }
            System.out.println();
        }
        System.out.println();
        //Full Pyramid Numbers(Consecutive numbers)
        //      1
        //     2 3
        //    4 5 6
        //   7 8 9 10
        // 11 12 13 14 15
        int V=1;
        for(int i=0;i<a;i++){
            for(int j=a-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" "+V);
                V++;
            }
            System.out.println();
        }
        System.out.println();
        //Full Pyramid(Single row Same number)
        //     0
        //    1 1
        //   2 2 2
        //  3 3 3 3
        // 4 4 4 4 4
        for(int i=0;i<a;i++){
            for(int j=a-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" "+i);
            }
            System.out.println();
        }
        System.out.println();
        //Full Pyramid NUmbers(Revresed Numbers)
        //        5
        //       4 4
        //      3 3 3
        //     2 2 2 2
        //    1 1 1 1 1
        for(int i=0,p=a;i<a;i++,p--){
            for(int j=a-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" "+p);
            }
            System.out.println();
        }
        System.out.println();
        //Inverted Right half Triangle
        // *****
        // ****
        // ***
        // **
        // *
        for(int i=a;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        //Inverted Right half Triangle(Numbres:Consecutive)
        // 1 2 3 4 5
        // 6 7 8 9
        // 10 11 12
        // 13 14
        // 15
        int O=1;
        for(int i=a;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print(" "+O);
            O++;
            }
            System.out.println();
        }
        System.out.println();
         //Inverted Right half Triangle(Alpahbet)
        //  A B C D E
        //  F G H I
        //  J K L
        //  M N
        //  O
        char S='A';
        for(int i=a;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print(" "+S);
            S++;
            }
            System.out.println();
        }
        System.out.println();
         //Inverted Right half Triangle(Single row Same number)
        //  5 5 5 5 5
        //  4 4 4 45
        //  3 3 3
        //  2 2
        //  1
        for(int i=a;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print(" "+i);
            }
            System.out.println();
        }
        System.out.println();
        //Iverted Left half Triangle
        for(int i=a;i>=0;i--){
            for(int j=0;j<=a-i;j++){
            System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        //Iverted Left half Triangle(Alphabet)
        char B='A';
        for(int i=a;i>=0;i--){
            for(int j=0;j<=a-i;j++){
            System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(""+B);
                B++;
            }
            System.out.println();
        }
        System.out.println();
        
        //Iverted Left half Triangle(Single row same number)
        for(int i=a;i>=0;i--){
            for(int j=0;j<=a-i;j++){
            System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(""+i);
            }
            System.out.println();
        }
        System.out.println();
        //Hollow Square
        for(int i=0;i<a;i++){
        for(int j=0;j<a;j++){
            if(i==0||j==0||i==a-1||j==a-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    System.out.println();
            //Hollow Square(Alphabet)
            char N='A';
            for(int i=0;i<a;i++){
                for(int j=0;j<a;j++){
                    if(i==0||j==0||i==a-1||j==a-1){
                        System.out.print(""+N);
                        N++;
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
                        //Hollow Square(Numbers:Consecutive)
                        int M=1;
                        for(int i=0;i<a;i++){
                            for(int j=0;j<a;j++){
                                if(i==0||j==0||i==a-1||j==a-1){
                                    System.out.print(""+M);
                                    M++;
                                }
                                else{
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
            
                        System.out.println();
                        //Hollow Square(Number:single row same number)
                        for(int i=0;i<a;i++){
                            for(int j=0;j<a;j++){
                                if(i==0||j==0||i==a-1||j==a-1){
                                    System.out.print(""+i);
                                    
                                }
                                else{
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                        System.out.println();
                        //Hollow Square(Number:single row same number)
                        for(int i=0;i<a;i++){
                            for(int j=0;j<a;j++){
                                if(i==0||j==0||i==a-1||j==a-1){
                                    System.out.print(""+i);
                                    
                                }
                                else{
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
            
                        System.out.println();
            //Square
            for(int i=0;i<a;i++){
                for(int j=0;j<a;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
                        //Square(Alphabets)
                        char G='A';
                        for(int i=0;i<a;i++){
                            for(int j=0;j<a;j++){
                                System.out.print(" "+G);
                                G++;
                            }
                            System.out.println();
                        }
System.out.println();
            //Square(NUmbers:Consecutive)
            int R=1;
            for(int i=0;i<a;i++){
                for(int j=0;j<a;j++){
                    System.out.print(" "+R);
                    R++;
                }
                System.out.println();
            }

            //Hollo Triangle
            for(int i=1;i<=a;i++){
                for(int j=i;j<a;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<=(2*i-1);k++){
                    if(k==1||i==a||k==(2*i-1)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

    }
    }
    

