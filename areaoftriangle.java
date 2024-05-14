import java.util.Scanner;
public class areaoftriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Enter base and height of the triangle: ");
        int b=sc.nextInt();
        int h=sc.nextInt();
        int area=b*h*1/2;
        System.out.println("Area of the triangle is: "+area);
        sc.close();*/
        System.out.println("Enter three sides of the traingle: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float s=(a+b+c)/2f;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is: "+area);
        sc.close();

    }
}
