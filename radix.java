import java.util.Scanner;
public class radix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.useRadix(2); //for binary numbers
        //sc.useRadix(8); for octal numbers
        //sc.useRadix(16);  for hexadecimal numbers
        int a=sc.nextInt();
        System.out.println(a);
        sc.close();

    }
    
}
