public class Bitwise {
    public static void main(String[] args) {
        int x=0b1010,z;
       // int y=0b0110; binary numbers can also be initialised
        //z=x&y;
        //z=x|y;
        //z=x^y;
        //z=~x;
        // System.out.println(z);
        
        
        //unsigned right shift operation
        z=x>>>1;
        System.out.println(String.format("%s",Integer.toBinaryString(x)));
        System.out.println(String.format("%32s",Integer.toBinaryString(z)));
        System.out.println(z);

    }
    
}
