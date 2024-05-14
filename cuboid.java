import java.util.Scanner;
public class cuboid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length,breadth and height of the cuboid: ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        float volume=l*b*h;
        float tsa=2*(l*b+b*h+h*l);
        System.out.println("Volume of the cuboid: "+volume);
        System.out.println("Total surface area of the cuboid: "+tsa);
        sc.close();
            }
    
}
