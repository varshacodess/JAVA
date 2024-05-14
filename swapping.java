public class swapping {
    public static void main(String[] args) {
        int a=10,b=15;
        System.out.println("Before swapping: ");
        System.out.println(a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping: ");
        System.out.println(a+" "+b);

    }
    
}
