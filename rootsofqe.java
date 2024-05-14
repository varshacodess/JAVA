import java.util.Scanner;
public class rootsofqe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a,b and c: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double r1=(-b+Math.sqrt((b*b)-4*a*c))/(2*a);
        double r2=(-b-Math.sqrt((b*b)-4*a*c))/(2*a);
        System.out.println("Roots of the quadratic equation are: ");
        System.out.println("Root r1: "+r1);
        System.out.println("Root r2: "+r2);
        sc.close();

    }
    
}
