package STR;
public class Builder {

    public static void main(String[] args) {

// //--->appendCodePoint(int Code Point)
        // StringBuilder sb = new StringBuilder("Hello");
        // System.out.println("The string:"+sb);
        // sb.appendCodePoint(67);
        // System.out.println("Modifies String:"+sb);

//--->int Capacity()
        StringBuilder str = new StringBuilder("Hello");
        int cap = str.capacity();
        System.out.println("Original String="+str);
        System.out.println("Original String Capacity="+cap);
        //add an additional word to string
        str.append(" Geeks");
        cap = str.capacity();
        //the capacity of the string after the adding of word
        System.out.println("Modified String="+str);
        System.out.println("Capacity of the modified String="+cap);
        //now lets add another big string that exceeds the string capacity
        str.append(" What the fuck are you guys doing");
        cap = str.capacity();
        //lets see the string capacity
        System.out.println("2nd Modification of the String="+str);
        System.out.println("Capacity of the 2nd Modified String="+cap);

//
    }
}