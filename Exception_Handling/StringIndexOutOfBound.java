package Exception_Handling;
//⁡⁣⁣⁢--->Note:⁡
//⁡⁣⁢⁣Def:⁡
/*It is thrown when an attempt is made to access 
an invalid index in a string 
Suppose the String length is 5 but if we ask to 
print the character at index 10 it throws
"StringIndexOutOfBound" i.e, we cannot accesse 
the  negative or graeter than equal to to the length 
of string */
public class StringIndexOutOfBound {
    public static void main(String[] args) {
        String str= "Hello";
        //here the string length is 5
        try{
            System.out.println(str.charAt(10));
            //System.out.println(str.charAt(-1));
            //System.out.println(str.charAt(5));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception Caught:"+e.getMessage());
        }
    }//
}
