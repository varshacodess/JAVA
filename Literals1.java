public class Literals1 {
    public static void main(String[] args) {
        //displaying 10 in different number systems
        byte b1=10;       //decimal  
        byte b2=0b1010;   //binary
        byte b3=012;     //octal
        byte b4=0xA;     //hexa-decimal
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

         // add L or l for long values
         // add f or F for float values cause decimal numbers are taken as double datatype by default 
        long l=123352321345L;
        System.out.println(l);
        float f=12.56f;
        double d=12.56;
        System.out.println(f);
        System.out.println(d);


    }
}
