import java.util.Scanner;

public class DataTypeDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //without using sc.useRadix(2);
        int x=5;
        int y=-5;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        sc.useRadix(2);
        System.out.println(y);
       // System.out.println(Integer.toHexString(y));
      //  System.out.println(Integer.toOctalString(y));
       sc.close();
    }
}
